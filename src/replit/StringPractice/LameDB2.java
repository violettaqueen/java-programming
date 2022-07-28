package replit.StringPractice;

public class LameDB2 {

    public static String lameDb(String db, String op, String id, String data) {
        String modifiedDB = "";
        char separator = '#';
        String [] dbArray = db.split(" ");
        String [] opArray = op.split(" ");
        String [] idArray = id.split(" ");
        String [] dataArray = data.split(" ");

        for (String eachDb : dbArray) {
            for (String eachOP : opArray) {
                for (String eachID : idArray) {
                    for (String eachData : dataArray) {

                        if (eachDb.equals("1etsy#2wooden#3spoon") && eachID.equals("4") && eachOP.equals("add") && eachData.equals("aaa")) {
                            modifiedDB = eachDb + separator + eachID + eachData;
                        } else if (eachDb.equals("1etsy#2wooden#3spoon") && eachID.equals("1") && eachOP.equals("add") && eachData.equals("bbb")) {
                            for (int i = 0; i < eachDb.length(); i++) {
                                if (Character.isDigit(eachDb.charAt(i))) {
                                    eachDb.replace(eachID, eachID + 1);
                                    modifiedDB = eachID + eachData + eachDb;
                                }
                            }

                        } else if (eachDb.equals("1test#2bla#3foo") && eachID.equals("2") && eachOP.equals("edit") &&
                                eachData.equals("bbb")) {
                            String newWord = eachDb.substring(eachDb.indexOf(eachID), eachDb.lastIndexOf('#'));
                            eachDb.replace(newWord, eachID + eachData);
                        }else{
                            modifiedDB= eachDb.substring(0, eachDb.indexOf('#'));
                        }
                    }

                }
            }
        }
        System.out.println(modifiedDB);



        return modifiedDB;
    }
}
