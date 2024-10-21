public class Store {
    private Tablet[] tablets;
    private int[] system;

    public Store() {
        tablets = new Tablet[1000];
        system = new int[3];
    }

    public boolean addTablet(Tablet tab) {
        int count = 0;
        for (int i = 0; i < tablets.length; i++) {
            if (tablets[i] == null) {
                count++;//במקרה ויש מקום פנוי
            }
        }
        if (count == 0) {//במקרה ואין מקום פנוי מחזיר false
            return false;
        } else {
            int count1 = 0;
            for (int i = 0; i < tablets.length; i++) {
                if (tablets[i].isSame(tab)) {//בודק אם הטאבלט שיש לי במערך שווה לטאבלט שאני רוצה להוסיף
                    count1++;
                    if (tab.getPrice() > tablets[i].getPrice()) {//בודק אם הטאבלט שאני רוצה להוסיף יותר גדול במחיר מהטאבלט שיש לי במערך ומעדכן
                        tablets[i].setPrice(tab.getPrice());
                    }
                    return true;
                }
                if (count1 == 0) {//במקרה ואם אין לי אותו טאבלט במערך
                    tablets[tablets.length - count] = tab;
                }
                if (tab.getSystem() == 'W') {
                    system[0] += 1;
                } else if (tab.getSystem() == 'A') {
                    system[1] += 1;
                } else if (tab.getSystem() == 'I') {
                    system[2] += 2;
                }
                return true;
            }
        }
        return false;
    }
//    המחלקה Store מייצגת מחסן. תכונות המחלקה:
//
//            • tablets - מערך עצמים מסוג Tablet. גודל המערך .1000
//            • systems - מערך מספרים שלמים. בכל תא במערך נשמר מספר סוגי המחשבים שחנות
//    מציעה ,לפי מערכת הפעלה: מספר המכשירים בעלי מערכת ווינדוס, מספר המכשירים בעלי
//    מערכת ההפעלה אנדרואיד ומספר המכשירים בעלי מערכת ההפעלה iOS.



}









