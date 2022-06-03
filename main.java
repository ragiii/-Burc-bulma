import java.util.Scanner;

public class main {

    public static void main(String[] args){
        int month,day;
        boolean isErro = false;
        String burc = "";
        Scanner imput=new Scanner(System.in);
        
        System.out.print("Doğduğunuz Ay :");
        month = input.nextInt();
        
        System.out.print("Doğduğunuz Gün :");
        day = input.nextInt();

        if(month == 1) {
            if (day >= 1 && day <= 31) {
                if (day > 21) {
                    burc = "Kova";
                } else {
                    burc = "Oğlak";
                }
            } else {
                isErro = true;
            }
        }
         else if (month == 2) {
            if (day >= 1 && day <= 28) {
                if (day > 19) {
                    burc = "Balık";
                } else {
                    burc = "Kova";
                }
            } else {
                isErro = true;
            }
        } else if (month == 3) {
            if (day >= 1 && day <= 31) {
                if (day > 20) {
                    burc = "Koç";
                } else {
                    burc = "Balık";
                }
            } else {
                isErro = true;

            }
        } else if (month == 4) {
            if (day >= 1 && day <= 31) {
                if (day > 20) {
                    burc = "Boğa";
                } else {
                    burc = "Koç";
                }
            } else {
                isErro = true;
            }
        } else if (month == 5) {
            if (day >= 1 && day <= 31) {
                if (day > 21) {
                    burc = "İkizler";
                } else {
                    burc = "Boğa";
                }
            } else {
                isErro = true;
            }
        } else if (month == 6) {
            if (day >= 1 && day <= 30) {
                if (day > 22) {
                    burc = "Yengeç";
                } else {
                    burc = "İkizler";
                }
            } else {
                isErro = true;
            }
        } else if (month == 7) {
            if (day >= 1 && day <= 30) {
                if (day > 22) {
                    burc = "Aslan";
                }
                burc = "Yengeç";
            } else {
                isErro = true;
            }
        } else if (month == 8) {
            if (day >= 1 && day <= 31) {
                if (day > 22) {
                    burc = "Başak";
                } else {
                    burc = "Aslan";
                }
            } else {
                isErro = true;
            }
        } else if (month == 9) {
            if (day >= 1 && day <= 30) {
                if (day > 22) {
                    burc = "Terazi";
                } else {
                    burc = "Başak";
                }
            } else {
                isErro = true;
            }
        } else if (month == 10) {
            if (day >= 1 && day <= 31) {
                if (day > 22) {
                    burc = "Akrep";
                } else {
                    burc = "Terazi";
                }
            } else {
                isErro = true;
            }
        } else if (month == 11) {
            if (day >= 1 && day <= 30) {
                if (day > 21) {
                    burc = "Yay";
                } else {
                    burc = "Akrep";
                }
            } else {
                isErro = true;
            }
        } else if (month == 12) {
            if (day >= 1 && day <= 31) {
                if (day > 21) {
                    burc = "Oğlak";
                } else {
                    burc = "Yay";
                }
            } else {
                isErro = true;
            }
        } else if (month >12) {
            isErro = true;
        }

         if(isErro) {
             System.out.println("Hatalı Giriş Yaptınız , Lütfen Tekrar Deniyiniz ! ");
         }else {
             System.out.println("Burcunuz : "+burc);
            
        }

    }

    }
