package pradeep;

public class StringOp {
	public static void main(String[] args) {
		String a = "prajual";
		String b = "PraJual";
		String c = "    pradeep   ";
		String d = "This is my String Opertion program";
		System.out.println(a.length());
		System.out.println(a.charAt(3));
		System.out.println(a.hashCode());
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(b));
		System.out.println(a.indexOf("j"));
		System.out.println(c.trim());
		
		System.out.println(a.startsWith("pr"));
		System.out.println(a.endsWith("l"));
		String f = a.replace("praj", "prad");
		System.out.println(f);
	}

}
