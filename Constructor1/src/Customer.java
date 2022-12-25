public class Customer {
        private String name;
        private double credit_limit;
        private String email;

        public Customer(String name, double credit_limit, String email) {
            this.name = name;
            this.credit_limit = credit_limit;
            this.email = email;
            System.out.println("name is " +name+ " and this is your credit score " +credit_limit+
                    " and sending this to your email " +email);
        }

        public Customer(){
            this("name",0,"email@email.com");
//            System.out.println("name is " +name+ " and this is your credit score " +credit_limit+
//                    " and sending this to your email " +email);
        }
        public Customer(String name, String email){
            this(name,0,email);
//            System.out.println("name is " +name+ " and this is your credit score " +credit_limit+
//                    " and sending this to your email " +email);
        }

        public String getName() {
            return name;
        }

        public double getCredit_limit() {
            return credit_limit;
        }

        public String getEmail() {
            return email;
        }
    }

