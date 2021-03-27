package html.unit.test.p02;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

public class HtmlTestMine {

	public static void main(String[] args) throws Exception {

		WebClient webClient = new WebClient(BrowserVersion.INTERNET_EXPLORER_11);
		HtmlPage page = webClient.getPage(HtmlTestMine.class.getResource("loginMock.html"));
		String encryptedPassword = page.getBody().getTextContent();
		System.out.println(encryptedPassword);
		webClient.closeAllWindows();

	}
}
