public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(15000);
        System.out.println("У вас на счёте: " + bankAccount.getAmount() + " сом. ");


       while (true){
           try {
               bankAccount.withDraw(6000);
               System.out.println("Указанная сумма успешна снята!" +
                       "У вас на счёте: " + bankAccount.getAmount() + " сом. ");
           } catch (LimitException e) {
               System.out.println(e.getMessage());
              try {
                  bankAccount.withDraw((int) bankAccount.getAmount());
              } catch (LimitException ex) {
                  throw new RuntimeException(ex);
              }
               System.out.println("Оставшая сумма успешна снята!");
               System.out.println(" Остаток на счёте: " + bankAccount.getAmount() + " сом. ");
               break;
           }
       }

    }
}