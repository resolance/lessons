package ru.ezhov.lessons.homework.resolance.glava5;

public class Theory {
    // поля и конструкторы внешнего класса
    public class Ship {
        public Ship() {
            System.out.println("Констрктор Класса Ship()");
        }
        private String model = "Fregat";
        private int mass = 500;

        public class Engine { // определение внутреннего класса

            public Engine(){System.out.println("Констрктор Класса Engine()");}
            // поля и методы
            private int mass = 500;
            private String model = "Fregat";
            public void launch() {System.out.println("Запуск двигателя");}
            public String getModel(){return model;}
            public void setModel(String model){this.model = model;}
            public int getMass() {return mass;}
            public int getMassShip() {return Ship.this.mass;}
            public void setMass(int mass) {this.mass = mass; Ship.this.mass = 700;}
            //Если попробовать не через сеттеры ??
        } // конец объявления внутреннего класса
    // методы внешнего класса
        public class Modifyer{
            int getMassV = new Theory().new VipShips().massV;
            String getModel = new Theory().new VipShips().modelV;

        }
    }
    private class VipShips{
        private int massV = 50;
        private String modelV = "BlackHours";

    }
    //Theory.VipShips refVIP = new Theory().new VipShips();
   // int massVIP = new Theory().new VipShips().massV;
   // String modelVIP = new Theory().new VipShips().modelV;

    public void setMassVIP(int newMassVIP) {
        new Theory().new VipShips().massV = newMassVIP;
    }
    public void setModelVIP(String newModelVIP) {
        new Theory().new VipShips().modelV = newModelVIP;
    }
}

//public class ship{} - ошибка компиляции, т.к. может существовать только один внешний паблик класс

class Ship {
    public static void main(String[] args) {
        Theory.Ship.Engine ref1 = new Theory().new Ship().new Engine();
        ref1.launch();
        System.out.println("Масса корабля: " + ref1.getMass()+ "  " +" Модель: " +ref1.getModel());
        ref1.setMass(100);
        ref1.setModel("Corsar");
        System.out.println("Масса корабля SHEP: " + ref1.getMassShip()+ "  " +" Модель: " +ref1.getModel());
        System.out.println("Масса корабля: " + ref1.getMass()+ "  " +" Модель: " +ref1.getModel());

        //Если попробовать не через сеттеры ??
        Theory.Ship ref2 = new Theory().new Ship();


        //CheckConstructorChild ref2 = new CheckConstructorChild();
        Theory.Ship.Modifyer ref3 = new Theory().new Ship().new Modifyer();
        System.out.println("Масса корабля: " + ref3.getMassV + "  " +" Модель: " +ref3.getModel);

        // Поменяем в приватном вип классе модель
        Theory ref = new Theory();
        ref.setMassVIP(20);
        ref.setModelVIP("Night Hunter");
        //System.out.println("Масса корабля: " + ref.massVIP + "  " +" Модель: " +ref.modelVIP);

        /**
         * 1) Здесь private поля класса Theory  не видны классу Ship
         * Если сделать pablic, то они станут доступны в классе Ship
         *
         * 2) для того чтобы получить доступ к подклассам класса Theory, небходимо создать объект родителя(outer
         * или enclosing класса. Именно по этой причине создана такая ужасная запись
         * Theory.Ship.Engine ref1 = new Theory().new Ship().new Engine();
         *
         * 3) при создании экземпляра внутреннего класса, конструктор по умолчанию родителя не вызывается.??
         * 4) как изменить поля класса Ship не применяя сеттеры внутри класса)
         * 5) Класс, вложенный в интерфейс, по умолчанию статический
         * */


    }
}