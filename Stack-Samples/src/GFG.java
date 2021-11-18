class GFG{

    // Function to generate a defanged
// version of IP address.
    static String GeberateDefangIP(String str)
    {
        String defangIP = "";

        // Loop to iterate over the
        // characters of the string
        for(int i = 0; i < str.length(); i++)
        {
            char c = str.charAt(i);
            if(c == '.')
            {
                defangIP += "[.]";
            }
            else
            {
                defangIP += c;
            }
        }
        return defangIP;
    }

    // Driver Code
    public static void main(String[] args)
    {
        String str = "255.100.50.0";

        System.out.println(GeberateDefangIP(str));
    }
}