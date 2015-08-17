SELECT Pid 
FROM 
  (SELECT * , count(Cid)
	 FROM ParentChild 
	 Group by Pid, gender
	) P
HAVING count(Pid) > 1
