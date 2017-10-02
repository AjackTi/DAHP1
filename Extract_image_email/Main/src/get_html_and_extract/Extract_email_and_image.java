package get_html_and_extract;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.imageio.ImageIO;

public class Extract_email_and_image {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String url = "http://kenh14.vn/khong-hieu-ky-duyen-da-lam-gi-ma-guong-mat-cang-luc-cang-khac-la-nhin-qua-kho-the-nhan-ra-20170930204829805.chn";
		String content = Fetch_Html(url);
				
		// email
		Filter_email(content);
		
		// image
		Filter_Image(content);
		
		// link
		Filter_link(content);
	}
	
	public static void Filter_email(String content)
	{
		System.out.println("Kết quả sau khi lọc các thành phần của trang web có chung định dạng giống Email: ");
		String pattern = "\\w{5,}@\\w{3,}.\\w{2,}";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(content);
		String str_email = "";
		while(m.find())
		{
			str_email += m.group(0);
			System.out.println(m.group(0));
		}
	}
	
	public static String Fetch_Html(String url_input)
	{
		// Get HTML
		String content = "";
		try {
            // get URL content
            String urlStr = url_input;
            URL url = new URL(urlStr);
            URLConnection connection = url.openConnection();

            InputStream inputStream = connection.getInputStream();
            
            // open the stream and put it into BufferedReader
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));

            String line = br.readLine();
			
			while(line !=null) {
				content += line;
				line = br.readLine();
			}
            br.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
		return content;
	}
	
	public static void Filter_Image(String content) throws IOException
	{
		// Lấy các phần tử của trang giống như thẻ img(<img src="" alt="">)
				// Ở đây hơi rắc rối nên nhóm quyết định tách ra làm 2 pattern:
				// Pattern 1: Lấy ra thẻ <img > từ trong page source ra
				// Pattern 2: Lấy link(chứa ảnh ra)
				System.out.println("---------------------------------------------------------------------------------");
				System.out.println("Kết quả sau khi lọc các thành phần của trang web có chung định dạng giống thẻ Img: ");
				String pattern3 = "<img src=\"(.+?)\"";
				Pattern p3 = Pattern.compile(pattern3);
				Matcher m3 = p3.matcher(content);
				ArrayList<String> arr_list1 = new ArrayList<>();
				while(m3.find())
				{
					arr_list1.add(m3.group(0));
				}
				
				ArrayList<String> arr_list1_1 = new ArrayList<>();
				for (String string : arr_list1) {
					//String pattern3_1 = "\"(.+?)\"";
					String pattern3_1 = "http(.+?){1,}[^\"]";
					Pattern p3_1 = Pattern.compile(pattern3_1);
					Matcher m3_1 = p3_1.matcher(string);
					while(m3_1.find())
					{
						arr_list1_1.add(m3_1.group(0));
					}
				}
				
				// Ở đây ta có được 1 list danh sách các image trong page source 
				// lấy current folder
				final String dir = System.getProperty("user.dir");
				// tạo 1 thư mục
				new File("Images").mkdir();
				//System.setProperty("user.dir", dir + "\\Images");
				int count = 0;
				for (String string : arr_list1_1) {
					System.out.println(string);
					String destinationFile = "image" + count +".jpg";
					count ++;
					saveImage(string, destinationFile);
				}
	}
	
	public static void Filter_link(String content)
	{
		// dựa vào thẻ <a href="">
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("Kết quả sau khi lọc các thành phần của trang web có chung định dạng giống link: ");
		String pattern = "href=\"(.+?)\"";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(content);
		ArrayList<String> arr_list_href = new ArrayList<>();
		while(m.find())
		{
			arr_list_href.add(m.group(0));
		}
		for (String string : arr_list_href) {
			pattern = "\"(.+?)\"";
			p = Pattern.compile(pattern);
			m = p.matcher(string);
			while(m.find())
			{
				String str_re = m.group(0);
				str_re = str_re.replace("\"", "");
				System.out.println(str_re);
			}
		}
	}
	
	public static void saveImage(String imageUrl, String destinationFile) throws IOException {
		URL url = new URL(imageUrl);
		InputStream is = url.openStream();
		OutputStream os = new FileOutputStream(destinationFile);

		byte[] b = new byte[2048];
		int length;

		while ((length = is.read(b)) != -1) {
			os.write(b, 0, length);
		}

		is.close();
		os.close();
	}
}
