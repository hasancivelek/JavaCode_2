package Week8_Lab;

abstract class File {
	 String name;
	public File() {
		
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public File(String name) {
		super();
		this.name = name;
	}
	abstract void open(); 
	void close(){
		
	}

	}
	 class XLSFile extends File {
	public XLSFile() {
		
	}


		@Override
		void open() {
			
			
		}
	    
	}
	 class PDFFile extends File{
		 public PDFFile() {
		
		 }
		public PDFFile(String name) {
			super(name);
			
		}

		@Override
		void open() {
			
			
		}
	    
	}
	 
	 class JPGFile extends File{

		@Override
		void open() {
			

			
		}
		 
	 }

	public class Abstract4 {
	    public static void main(String[] args) {
	        //File file1 = new File(); will not work, cannot create object
	        XLSFile xl = new XLSFile();
	        xl.open();
	        xl.close();
	        xl.setName("TestData.xls");
	        System.out.println("XLS file name: " + xl.getName());
	         
	        JPGFile jpg = new JPGFile();
	        jpg.setName("Event01.jpg");
	        jpg.open();
	        jpg.close();
	        System.out.println("JPG file name: " + jpg.getName());
	         
	       
	         
	        PDFFile pdf = new PDFFile("AgileBook.pdf");
	        pdf.open();
	        pdf.close();
	         System.out.println("PDF file name :"+pdf.getName());
	       
	         
	    }
	 
	}
