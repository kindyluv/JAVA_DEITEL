public class Account {
    private String accountName;
    private String userName;
    private int idNumber;
    private float accountBalance;

    public static void main(String[] args){

        public Account(String accounName, String userName, int idNumber, float accountBalance){
            this.accountName = accountName;
            this.userName = userName;
            this.idNumber = idNumber;
            this.accountBalance = accountBalance;
        }

        public void setAccountName( String accountName){
            this.accountName = accountName;
        }

        public String getAccountName(){
            return accountName;
        }

        public void setUserName( String userName){
            this.userName = userName;
        }

        public String getUserName(){
            return userName;
        }

        public void setIdNumber(int idNumber){
            this. idNumber = idNumber;
        }

        public int getIdNumber(){
            return idNumber;
        }

        public void setAccountBalance(float accountBalance){
            this.accountBalance = accountBalance;
        }

        public float getAccountBalance(){
            return accountBalance;
        }
    }



}
