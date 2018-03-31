package beat.mercy.service;

import beat.mercy.entity.dto.CarServiceDTO;

public interface IServiceOrderService {

	public Boolean createServiceOrder(String plateNo,Long userId,CarServiceDTO dto);
}
