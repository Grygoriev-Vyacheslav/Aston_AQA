public class Park {
    public  class Attractions {

        private String name;
        private String time;
        private double cost;

        public Attractions(String _name, String _time, double _cost) {
            this.name = _name;
            this.time = _time;
            this.cost = _cost;

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;

        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public double getCost() {
            return cost;
        }

        public void setCost(double cost) {
            this.cost = cost;
        }


    }


}