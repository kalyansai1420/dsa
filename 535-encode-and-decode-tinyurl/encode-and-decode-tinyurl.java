public class Codec {

    private HashMap<String,String> longToShort = new HashMap<>();
    private HashMap<String,String> shortToLong = new HashMap<>();
    private static final String BASE62 = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String PREFIX = "http://tinyurl.com/";
    private int id = 1;

    private String encodeBase62(int num){
        StringBuilder sb = new StringBuilder();
        while(num>0){
            sb.append(BASE62.charAt(num % 62));
            num = num /62;
        }
        return sb.reverse().toString();
    }
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        if(longToShort.containsKey(longUrl)){
            return PREFIX + longToShort.get(longUrl);
        }

        String shortCode = encodeBase62(id);
        id++;
        longToShort.put(longUrl,shortCode);
        shortToLong.put(shortCode,longUrl);
        return PREFIX + shortCode;
        
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        String shortCode = shortUrl.replace(PREFIX,"");
        return shortToLong.get(shortCode);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));