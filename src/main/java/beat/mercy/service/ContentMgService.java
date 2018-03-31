package beat.mercy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import beat.mercy.common.util.PageableBuilder;
import beat.mercy.entity.Advertisement;
import beat.mercy.entity.state.AdvertiseLocation;
import beat.mercy.repository.AdvertisementRepository;

@Service
public class ContentMgService implements IContentMgService {

	@Autowired
	private AdvertisementRepository adRepository;

	@Override
	public List<Advertisement> findHomeCarousel() {
		return adRepository.findByLocationAndIsShow(AdvertiseLocation.HOME, true,
				new PageableBuilder().buildSort("sequence").buildDir("desc").getPageable());
	}

}
