package beat.mercy.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import beat.mercy.common.util.PageableBuilder;
import beat.mercy.common.util.RestJsonResult;
import beat.mercy.entity.Customer;
import beat.mercy.entity.Order;
import beat.mercy.entity.Vehicle;
import beat.mercy.entity.state.LatestDateRange;
import beat.mercy.repository.CustomerRepository;
import beat.mercy.repository.OrderRepository;
import beat.mercy.repository.VehicleRepository;
import beat.mercy.service.ICustomerTransactionService;

@Service
@Transactional
public class CustomerTransactionService implements ICustomerTransactionService {

	@Autowired
	CustomerRepository customerRepo;

	@Autowired
	OrderRepository orderRepo;

	@Autowired
	VehicleRepository vehicleRepo;

	public Boolean onlyEnglishInside(String str) {
		if (str.length() > 6)
			return false;
		List<Character> characters = Arrays.asList('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
				'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '1', '2', '3', '4', '5', '6', '7', '8', '9',
				'0');
		String c = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		for (int i = 0; i < str.length(); i++) {
			if (!characters.contains(str.charAt(i)))
				return false;
		}
		return true;
	}

	@Override
	public Page<Order> findCustomerOrders(Long customerId, LatestDateRange dateRange, PageableBuilder pageableBuilder) {
		if (dateRange.equals(LatestDateRange.all))
			return orderRepo.findByUserId(customerId, pageableBuilder.getPageable());

		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yy/MM/dd");
			Calendar calendar = Calendar.getInstance();

			Date now = sdf.parse(sdf.format(new Date()));

			calendar.setTime(now);

			switch (dateRange) {
			case latestMonth:
				calendar.add(Calendar.MONTH, -1);
				System.err.println(calendar.getTime());
				return orderRepo.findByUserIdAndCreateTimeAfter(customerId, calendar.getTime(),
						pageableBuilder.getPageable());
			case latestThreeMonth:
				calendar.add(Calendar.MONTH, -3);
				System.err.println(calendar.getTime());
				return orderRepo.findByUserIdAndCreateTimeAfter(customerId, calendar.getTime(),
						pageableBuilder.getPageable());
			case latestYear:
				calendar.add(Calendar.YEAR, -1);
				System.err.println(calendar.getTime());
				return orderRepo.findByUserIdAndCreateTimeAfter(customerId, calendar.getTime(),
						pageableBuilder.getPageable());

			default:
				return orderRepo.findByUserId(customerId, pageableBuilder.getPageable());
			}
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public Page<? extends Order> findCustomerMaintenance(Long customerId,LatestDateRange dateRange,PageableBuilder pageableBuilder){
		String serviceType = "CarMaintenanceOrder";
		if (dateRange.equals(LatestDateRange.all))
			return orderRepo.findByUserIdAndType(customerId, serviceType, pageableBuilder.getPageable());

		SimpleDateFormat sdf = new SimpleDateFormat("yy/MM/dd");
		Calendar calendar = Calendar.getInstance();

		Date now;
		try {
			now = sdf.parse(sdf.format(new Date()));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		calendar.setTime(now);
		switch (dateRange) {
		case latestMonth:
			calendar.add(Calendar.MONTH, -1);
			System.err.println(calendar.getTime());
			return orderRepo.findByUserIdAndTypeAndCreateTimeAfter(customerId, serviceType, calendar.getTime(),
					pageableBuilder.getPageable());
		case latestThreeMonth:
			calendar.add(Calendar.MONTH, -3);
			System.err.println(calendar.getTime());
			return orderRepo.findByUserIdAndTypeAndCreateTimeAfter(customerId, serviceType, calendar.getTime(),
					pageableBuilder.getPageable());
		case latestYear:
			calendar.add(Calendar.YEAR, -1);
			System.err.println(calendar.getTime());
			return orderRepo.findByUserIdAndTypeAndCreateTimeAfter(customerId, serviceType, calendar.getTime(),
					pageableBuilder.getPageable());

		default:
			return orderRepo.findByUserId(customerId, pageableBuilder.getPageable());
		}
		 
	}
	public Page<? extends Order> findCustomerRepair(Long customerId,LatestDateRange dateRange,PageableBuilder pageableBuilder){
		String serviceType = "CarRepairOrder";
		if (dateRange.equals(LatestDateRange.all))
			return orderRepo.findByUserIdAndType(customerId, serviceType, pageableBuilder.getPageable());

		SimpleDateFormat sdf = new SimpleDateFormat("yy/MM/dd");
		Calendar calendar = Calendar.getInstance();

		Date now;
		try {
			now = sdf.parse(sdf.format(new Date()));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		calendar.setTime(now);
		switch (dateRange) {
		case latestMonth:
			calendar.add(Calendar.MONTH, -1);
			System.err.println(calendar.getTime());
			return orderRepo.findByUserIdAndTypeAndCreateTimeAfter(customerId, serviceType, calendar.getTime(),
					pageableBuilder.getPageable());
		case latestThreeMonth:
			calendar.add(Calendar.MONTH, -3);
			System.err.println(calendar.getTime());
			return orderRepo.findByUserIdAndTypeAndCreateTimeAfter(customerId, serviceType, calendar.getTime(),
					pageableBuilder.getPageable());
		case latestYear:
			calendar.add(Calendar.YEAR, -1);
			System.err.println(calendar.getTime());
			return orderRepo.findByUserIdAndTypeAndCreateTimeAfter(customerId, serviceType, calendar.getTime(),
					pageableBuilder.getPageable());

		default:
			return orderRepo.findByUserId(customerId, pageableBuilder.getPageable());
		}
	}

	@Override
	public RestJsonResult bindCar(Long userId, Vehicle vehicle) {
		Customer user = customerRepo.findOne(userId);
		Assert.notNull(user, "用户不存在");
		Assert.notNull(vehicle.getBrand(), "汽车品牌不可为空");
		Assert.notNull(vehicle.getPlateNo(), "汽车车牌号不可为空");
		Assert.state(onlyEnglishInside(vehicle.getPlateNo().substring(1)), "车牌号不合法，位数不足或字符不合法");
		Vehicle exist = vehicleRepo.findByPlateNo(vehicle.getPlateNo());
		RestJsonResult result = new RestJsonResult();
		if (exist != null) {
			Assert.isNull(exist.getOwner(), "改车牌号已在本店注册绑定用户，请联系管理员QQ:304921113");
			// 绑定已有车辆
			BeanUtils.copyProperties(vehicle, exist, "plateNo","id","owner");
			exist.setOwner(user);
			result.buildSuccessResult(vehicleRepo.save(exist));
			return result;
		}else {
			vehicle.setOwner(user);
			result.buildSuccessResult(vehicleRepo.save(vehicle));
			return result;	
		}
		
	}

	public RestJsonResult editCar(Long userId, Vehicle vehicle) {
		Customer user = customerRepo.findOne(userId);
		Assert.notNull(user, "用户不存在");
		Vehicle exist = vehicleRepo.findOne(vehicle.getId());
		Assert.state(exist.getPlateNo().equals(vehicle.getPlateNo()), "汽车车牌号不可修改");
		Assert.state(user.getId().equals(exist.getOwner().getId()), "用户车主与您不一致！");
		BeanUtils.copyProperties(vehicle, exist, "id", "plateNo", "owner", "travelMiles");

		Assert.notNull(exist.getBrand(), "汽车品牌不可为空");

		RestJsonResult result = new RestJsonResult();
		result.buildSuccessResult(vehicleRepo.save(exist));
		return result;
	}

	public RestJsonResult unbindCar(Long userId, Long vehicleId) {
		Customer user = customerRepo.findOne(userId);
		Assert.notNull(user, "用户不存在");
		Vehicle exist = vehicleRepo.findOne(vehicleId);
		Assert.notNull(exist, "本店不存在该车辆");

		Assert.state(exist.getOwner().getId().equals(userId), "您不拥有该车牌号的车辆");

		exist.setOwner(null);
		user.getVehicles().removeIf(car -> car.getId().equals(vehicleId));
		customerRepo.save(user);
		vehicleRepo.save(exist);

		RestJsonResult result = new RestJsonResult();
		result.buildSuccessResult("", "解绑成功");
		return result;
	}
}
