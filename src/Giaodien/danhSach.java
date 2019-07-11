package Giaodien;

public class danhSach {
		public String name;
		public int portNumber;
		public String ipNumber;
		
		public danhSach(String name,String ipNumber, int portNumber ) {
			this.ipNumber = ipNumber;
			this.name = name;
			this.portNumber = portNumber ;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getPortNumber() {
			return portNumber;
		}
		public void setPortNumber(int portNumber) {
			this.portNumber = portNumber;
		}
		public String getIpNumber() {
			return ipNumber;
		}
		public void setIpNumber(String ipNumber) {
			this.ipNumber = ipNumber;
		}
	}
