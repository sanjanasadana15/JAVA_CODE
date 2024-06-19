public class newCode18JUNE 
{
    public static void main(String[] args) {

        /* Primitive Types  */
        byte age = 30;
        int phone = 1234567892;
        long phone2 = 12345678910L;
        float pi=3.14F;
        char letter='@';
        boolean isAdult = false;

        /* Non-Primitive Types */

        String name ="Sanjana";
        System.out.println(name.length());
        String friend = new String("Sanju");
        System.out.println("friend");



        /* Concatenate = String 1+String2 */

        String name1="Sanjana";
        String name2=" Sadana";
        String name3 = name1+" and " +name2;
        System.out.println(name3);


        /* CharAt*/
        String charNAme = "Sanjana";
        System.out.println(charNAme.charAt(0));
        System.out.println(charNAme.charAt(1));

        /* Replace */
        String repName = "Sanjana";
        String repName2 = repName.replace('a', 'z');
        System.out.println(repName2);
        System.out.println(repName);

        /* Substring */

        String subName = "Sanjana and Athul";
        System.out.println(subName.substring(12, 17));



    }
    
}
