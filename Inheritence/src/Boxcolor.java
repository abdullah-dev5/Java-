 class Boxcolor extends Boxweight {
            String color;
        public Boxcolor()
        {
            super();
            color =" ";

        }
     public Boxcolor(String color) {
         this.color = color;
     }

     public Boxcolor(double l, double w, double h, double weight, String color) {
         super(l, w, h, weight);
         this.color = color;
     }

     public Boxcolor(Boxweight other, String color) {
         super(other);
         this.color = color;
     }

     public Boxcolor(double side, double weight, String color) {
         super(side, weight);
         this.color = color;
     }
 }
