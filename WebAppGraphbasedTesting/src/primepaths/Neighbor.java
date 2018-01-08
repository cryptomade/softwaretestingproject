package primepaths;


	class Neighbor {
		public int vertexNum;
		public Neighbor next;
		public Neighbor(int num, Neighbor ngbr){
			this.vertexNum = num;
			this.next = ngbr;
	}
	
}