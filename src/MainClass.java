public class MainClass {
    public static void main(String[] args) {
        Employees[] persArray = new Employees[5];
        persArray[0] = new Employees(1, "Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Employees(2, "Ivanov Igor", "QA", "igrov@mailbox.com", "892312313", 40000, 35);
        persArray[2] = new Employees(3, "Yanex Igor", "AQA", "yanex@mailbox.com", "892312314", 50000, 45);
        persArray[3] = new Employees(4, "Vanos Yan", "Dev", "vanos@mailbox.com", "892312315", 60000, 48);
        persArray[4] = new Employees(5, "Daniels Jak", "Dev", "Daniel@mailbox.com", "892312316", 60000, 25);
        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getAge() > 40) {
                persArray[i].printInfo();
            }
        }
    }
}
