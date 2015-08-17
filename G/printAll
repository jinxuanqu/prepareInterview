public class PrintAllStringss {
	
	public void printAll(String s){
		if(s.length() < 1)
			return;
		dfs(s, 0, new StringBuilder());
	}
	
	private void dfs(String s, int cur, StringBuilder buffer){
		if(cur >= s.length()){
			System.out.println(buffer);
			return;
		}
		char c = s.charAt(cur);
		if(c != '*'){
			buffer.append(c);
			dfs(s, cur + 1, buffer);
			buffer.deleteCharAt(buffer.length() - 1);
		}else{
			buffer.append('k');
			dfs(s, cur + 1, buffer);
			buffer.deleteCharAt(buffer.length() - 1);
			buffer.append('j');
			dfs(s, cur + 1, buffer);
			buffer.deleteCharAt(buffer.length() - 1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintAllStringss printAll = new PrintAllStringss();
		printAll.printAll("a**b");

	}

}
