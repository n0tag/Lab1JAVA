package pl.lublin.wsei.java.cwiczenia.mylib;

//import org.apache.commons.lang3.StringUtils;

public class Account {
//    public String name;

    private static char cyrAlphabet[] = {'а', 'б', 'в', 'г', 'д', 'е', 'є', 'ж', 'з', 'и', 'і', 'ї', 'й', 'к', 'л', 'м', 'н', 'о',
            'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ь', 'ю', 'я'};

    private static String translit[] = {"a","b","v","g","d","e","je","zh","z","y","i","ji", "j","k","l","m","n","o",
            "p","r","s","t","u","f","ch","c", "cz","sh","sh'","'","ju","ja"};

    public static String translit(String arg)
    {
        String cur1 = arg.toLowerCase();
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < cur1.length(); i++)
        {
            for(int j = 0; j < cyrAlphabet.length; j++)
            {
                if (cur1.charAt(i) == cyrAlphabet[j])
                {
                    builder.append(translit[j]);
                }
            }
        }
        return builder.toString();
    }



//    public static String capitalize(String aStr)
//    {
//       String[] tokens = StringUtils.split(aStr);
//        for(int i = 0; i < tokens.length; i++)
//            tokens[i] = StringUtils.capitalize(tokens[i]);
//        return StringUtils.join(tokens,' ');
//    }
//    public void setName(String name) {
//        String[] tokens = StringUtils.split(name);
//        for(int i = 0; i < tokens.length; i++)
//            tokens[i] = StringUtils.capitalize(tokens[i]);
//        this.name = StringUtils.join(tokens,' ');
//    }

//    public String getName() {
//        return name;
//    }

}