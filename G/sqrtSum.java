public List<Integer> sqrtSum(int num){
		List<Integer> res = new ArrayList<Integer>();
		if(num < 0){
			return res;
		}
		int left = 0, right = num;
		int mid = (left + right) >> 1;
		while(left <= right){
			mid = (left + right) >> 1;
			int a = mid * mid;
			int b = (mid + 1) * (mid + 1);
			if(a <= num && b > num){
				break;
			}else if(a > num){
				right = mid - 1;
			}else{
				left = mid + 1;
			}
		}
		if(mid <= 0){
			return res;
		}
		int[] min = new int[1];
		min[0] = Integer.MAX_VALUE;
		List<Integer> sol = new ArrayList<Integer>();
		dfs(num, mid, sol, res, min);
		return res;
	}
	
	private void dfs(int num, int cur, List<Integer> sol, List<Integer> res, int[] min){
		if(num == 0 && sol.size() < min[0]){
			min[0] = Math.min(min[0], sol.size());
			res.clear();
			for(int i : sol){
				res.add(i);
			}
			return;
		}else if(num <= 0){
			return;
		}
		for(int i = cur; i > 0; i--){
			int a = i * i;
			sol.add(a);
			//System.out.println(num - a + ", " + cur);
			dfs(num - a, i, sol, res, min);
			sol.remove(sol.size() - 1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SqrtSum sol = new SqrtSum();
		List<Integer> list = sol.sqrtSum(12);
		for(int i : list){
			System.out.print(i + " - ");
		}

	}
