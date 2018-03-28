package beat.mercy;

public class StateDesignModeTest {
	public static void main(String[] args) {
		StateDesignModeTest instance = new StateDesignModeTest();
		Light light = instance.getLight();

		// 初始调用为红灯
		light.showColor();
		// 再调用为绿灯
		light.showColor();
		// 再调用为黄灯
		light.showColor();
		// 不断调用,不断循环.
	}
	
	public Light getLight() {
		return new Light();
	}

	// 定义灯的种类与行为
	public interface Color {
		public void show();
	}

	// 
	class Light {
		Color color;

		public Color getColor() {
			return color;
		}

		public void setColor(Color color) {
			this.color = color;
		}

		public Light() {
			color = new RedColor(this);
		}

		public void showColor() {
			color.show();
		}

	}

	class RedColor implements Color {
		Light light;

		public RedColor(Light light) {
			this.light = light;
		}

		public void show() {
			System.out.println("红灯");
			System.out.println("处理中.....");
			light.setColor(new GreenColor(light));
		}
	}

	class GreenColor implements Color {
		Light light;

		public GreenColor(Light light) {
			this.light = light;
		}

		public void show() {
			System.out.println("绿灯");
			System.out.println("处理中.....");
			light.setColor(new YellowColor(light));
		}
	}

	class YellowColor implements Color {
		Light light;

		public YellowColor(Light light) {
			this.light = light;
		}

		public void show() {
			System.out.println("黄灯");
			System.out.println("处理中.....");
			// 更新路灯的灯色，并将灯色关联原路灯
			light.setColor(new RedColor(light));
		}
	}

}
