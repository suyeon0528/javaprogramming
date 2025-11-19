package java_11week;

// 1. 추상 클래스 Printer
abstract class Printer {
    protected String model;
    protected int printedCount;
    protected int availableCount;

    public Printer(String model, int availableCount) {
        this.model = model;
        this.availableCount = availableCount;
        this.printedCount = 0; // 초기 출력 매수는 0
    }

    // 추상 메소드
    public abstract boolean print();
}

// 2. InkjetPrinter 클래스 (Printer 상속)
class InkjetPrinter extends Printer {
    public InkjetPrinter(String model, int availableCount) {
        super(model, availableCount);
    }

    @Override
    public boolean print() {
        if (availableCount == 0) {
            // availableCount 값이 0일 경우: 잉크 부족 메시지 출력 및 false 리턴
            System.out.println(this.model + ": " + (this.printedCount + 1) + "매째 인쇄 실패 - 잉크 부족.");
            return false;
        } else {
            // availableCount 값이 1 이상이면:
            // printedCount 1 증가, availableCount 1 감소시키고 true 리턴
            this.printedCount++;
            this.availableCount--;
            return true;
        }
    }
}

// 3. LaserPrinter 클래스 (Printer 상속)
class LaserPrinter extends Printer {
    public LaserPrinter(String model, int availableCount) {
        super(model, availableCount);
    }

    @Override
    public boolean print() {
        if (availableCount == 0) {
            // availableCount 값이 0일 경우: 토너 부족 메시지 출력 및 false 리턴
            System.out.println(this.model + ": " + (this.printedCount + 1) + "매째 인쇄 실패 - 토너 부족.");
            return false;
        } else {
            // availableCount 값이 1 이상이면:
            // printedCount 1 증가, availableCount 1 감소시키고 true 리턴
            this.printedCount++;
            this.availableCount--;
            return true;
        }
    }
}


public class Homework7 {
    public static void main(String[] args) {
        // 요구 사항에 따라 객체 생성
        InkjetPrinter inkjet = new InkjetPrinter("Brother DCP-T730DW", 7500);
        LaserPrinter laser = new LaserPrinter("Canon MFC643Cdw", 1500);

        // InkjetPrinter: 7501매째까지 print() 반복
        while (inkjet.print());

        // LaserPrinter: 1501매째까지 print() 반복
        while (laser.print());
    }
}
