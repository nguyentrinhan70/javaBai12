package nguyentrinhan70.example.com.test;
import java.util.ArrayList;
import nguyentrinhan70.example.com.io.SerializeFileFactory;
import nguyentrinhan70.example.com.io.TextFileFactory;
import nguyentrinhan70.example.com.model.KhachHang;
public class TestKhachHang2 {
	public static void testLuuFile(){
		ArrayList <KhachHang>dsKH = new ArrayList<KhachHang>();
		dsKH.add(new KhachHang("KH001","Nguyễn Trí Nhân"));
		dsKH.add(new KhachHang("KH002","Trần Thị Minh Hằng"));
		dsKH.add(new KhachHang("KH003","Nguyễn Lê Trí Tín"));
		dsKH.add(new KhachHang("KH004","Nguyễn Trần Khánh Hà"));
		dsKH.add(new KhachHang("KH005","Nguyễn Khánh Ngân"));

		boolean kt = SerializeFileFactory.luuFile(dsKH, "d:\\dulieu2.txt");
		if(kt ==true){
			System.out.println("Đã lưu file thành công");
		}
		else{
			System.out.println("Lưu file thất bại");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testLuuFile();
		ArrayList<KhachHang> dsKH = SerializeFileFactory.docFile("d:\\dulieu2.txt");
		System.out.println("Danh sách hàng nạp vào máy tính là:");
		System.out.println("Mã \t Tên");
		for(KhachHang kh: dsKH){
			System.out.println(kh);
		}
	}}
