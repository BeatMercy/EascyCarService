package beat.mercy.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class CarPlateScan {

	private int carCount = 0;
	
	@Scheduled(fixedRate = 6000)
	private void scanFloder() {
		//System.err.println("Scan the floder of car plate!");
	}
}
