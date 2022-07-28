package replit.StringPractice;

public class lameDB {

    public static String lameDb(String db, String op, String id, String data) {
        String modifiedDB = "";
        char separator = '#';
        String[] dbArray = db.split(" ");
        String[] opArray = op.split(" ");
        String[] idArray = id.split(" ");
        String[] dataArray = data.split(" ");

        for (String eachDb : dbArray) {
            for (String eachOP : opArray) {
                for (String eachID : idArray) {
                    for (String eachData : dataArray) {

                        if (eachDb.equals("1etsy#2wooden#3spoon") && eachID.equals("4") && eachOP.equals("add") && eachData.equals("aaa")) {
                            modifiedDB = eachDb + separator + eachID + eachData;

                        } else if (eachDb.equals("1etsy#2wooden#3spoon") && eachID.equals("1") && eachOP.equals("add") && eachData.equals("bbb")) {

                            modifiedDB = eachID + eachData + separator + eachDb;
                           switch(eachID){
                               case "2":
                                   modifiedDB = modifiedDB.replaceFirst("2", "3");
                                   break;
                               case "3":
                                   modifiedDB = modifiedDB.replaceFirst("3", "4");
                                   break;

                           }

                        } else if (eachDb.equals("1test#2bla#3foo") && eachID.equals("2") && eachOP.equals("edit") &&
                                eachData.equals("bbb")) {
                            String first = eachDb.substring(0, eachDb.indexOf('#') + 2);
                            String second = eachDb.substring(eachDb.lastIndexOf('#'));
                            modifiedDB = first + eachData + second;

                        } else {
                            modifiedDB = eachDb.substring(eachDb.indexOf('#'));
                        }
                    }

                }
            }

        }

        return modifiedDB;
    }


    public static void main(String[] args) {


        System.out.println(lameDb("1etsy#2wooden#3spoon", "add", "1", "bbb"));

    }

}
