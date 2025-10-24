class Lythuyet extends Monhoc {
  
        private double diemTL, diemCK;
    
        public Lythuyet(String ma, String ten, int soTC, double tl, double ck) {
            super(ma, ten, soTC);
            this.diemTL = tl;
            this.diemCK = ck;
        }
    
        @Override
        public double tinhDTB() {
            return diemTL * 0.4 + diemCK * 0.6;
        }
    }
