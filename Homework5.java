public class Homework5 {

    // Computer 클래스 정의
    public static class Computer {
        private String cpu;
        private String memory;
        private String hd;
        private String color;
        private String power;

        public Computer(String cpu, String memory, String hd, String color, String power) {
            this.cpu = cpu;
            this.memory = memory;
            this.hd = hd;
            this.color = color;
            this.power = power;
        }

        public void turnOn() {
            System.out.println("Turning on the computer.");
        }

        public void printInfo() {
            System.out.println("The spec of the computer");
            System.out.println("CPU: " + cpu);
            System.out.println("Memory: " + memory);
            System.out.println("HDD: " + hd);
            System.out.println("Color: " + color);
            System.out.println("Power: " + power);
        }
    }

    // Monitor 클래스 정의
    public static class Monitor {
        private String monitorSize;
        private String color;
        private String power;

        public Monitor(String monitorSize, String color, String power) {
            this.monitorSize = monitorSize;
            this.color = color;
            this.power = power;
        }

        public void turnOn() {
            System.out.println("Turning on the monitor.");
        }

        public void printInfo() {
            System.out.println("The spec of the monitor");
            System.out.println("Size: " + monitorSize);
            System.out.println("Color: " + color);
            System.out.println("Power: " + power);
        }
    }

    // PersonalComputer 클래스 정의
    public static class PersonalComputer {
        private Computer computer;
        private Monitor monitor;

        public PersonalComputer(Computer computer, Monitor monitor) {
            this.computer = computer;
            this.monitor = monitor;
        }

        public void turnOn() {
            computer.turnOn();
            monitor.turnOn();
        }

        public void printInfo() {
            computer.printInfo();
            monitor.printInfo();
        }
    }

    // Main 메소드를 포함하는 Homework5 클래스
    public static void main(String[] args) {
        Computer myComputer = new Computer(
            "Core i7",
            "32GB",
            "2TB",
            "Black",
            "700W"
        );

        Monitor myMonitor = new Monitor(
            "32 inch",
            "Black",
            "45W"
        );

        PersonalComputer myPC = new PersonalComputer(myComputer, myMonitor);

        myPC.turnOn();
        myPC.printInfo();
    }
}