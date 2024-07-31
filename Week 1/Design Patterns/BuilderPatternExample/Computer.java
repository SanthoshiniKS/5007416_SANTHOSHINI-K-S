package BuilderPatternExample;

class Computer {

    String CPU;
    String RAM;
    String Storage;
    String screenSize;

    private Computer(Builder b) {
        this.CPU = b.CPU;
        this.RAM = b.RAM;
        this.Storage = b.Storage;
        this.screenSize = b.screenSize;
    }

    public String toString() {
        return "Computer [CPU = " + CPU + ", RAM = " + RAM + ", Storage = " + Storage
                + ", ScreenSize = " + screenSize + "]";
    }

    public static class Builder {

        String CPU;
        String RAM;
        String Storage;
        String screenSize;

        public Builder setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public Builder setRAM(String RAM) {
            this.RAM = RAM;
            return this;
        }

        public Builder setStorage(String Storage) {
            this.Storage = Storage;
            return this;
        }

        public Builder setScreenSize(String screenSize) {
            this.screenSize = screenSize;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
