public class Passenger {package com.ug4.soal1;

    public class Passenger {
        private String name;
        private double balance;
        private String email;
        private String destiny;

        public Passenger(String name, String email, double balance){
            this.name = name;
            this.email = email;
            this.balance = balance;
        }

        public String getName(){
            return name;
        }
        public void setName(String setName){
            name = setName;
        }
        public double getBalance(){
            return balance;
        }
        public void setBalance(double setBalance){
            balance = setBalance;
        }
        public String getEmail(){
            return email;
        }
        public void setEmail(String setEmail){
            email = setEmail;
        }
        public String getDestiny(){
            return destiny;
        }
        public void setDestiny(String setDestiny){
            destiny = setDestiny;
        }
    }
}
