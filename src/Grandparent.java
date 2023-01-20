
    public class Grandparent extends Person {
        private int years;
        //grandparent has a first name a last name and an age and get methods it also has a to string method that overrides person
        public Grandparent(String firstName, String lastName, String phoneNumber, int years)
        {
            super(firstName, lastName, phoneNumber);
            this.years = years;
        }

        public int getAge() {
            return years;
        }

        public void setAge(int years) {
            this.years = years;
        }
        public String getFirstName() {
            return super.getFirstName();

        }
        public String getLastName() {
            return super.getLastName();
        }



        public String getPhoneNumber() {
            return super.getPhoneNumber();
        }

        //shows its overriden
        @Override
        public String toString()
        {
            return super.toString() + " Is: " + years;
        }

// TODO: Modify and complete this class
    }



