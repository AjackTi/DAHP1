package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RE2 {

	@SuppressWarnings({ "null", "unused" })
	public static void main(String[] args) throws IOException {
		//String cmttext = "<div class=\"mingid-commentData\"> <ul class=\"cm-list\" id=\"comment_post_0\" alt=\"0\">    <li id=\"itemComment_59895d1e774c496619e012bd\" name=\"itemComment_59895d1e774c496619e012bd\"> <div id=\"form_comment_59895d1e774c496619e012bd\"> <div class=\"left-cont\"> <div class=\"avatar\"> <a target=\"_blank\" href=\"http://vietid.net/click.php?id=MTYwNzY4NjYx&amp;c=e7d3035c24346b6741c5eb94022b40d8\"><img alt=\"tuandat.951130@gmail.com\" src=\"https://mingid.mediacdn.vn//thumb/48_48/images/avatars/160768661.jpg\" onerror=\"this.src='https://mingid.mediacdn.vn/v4/images/comment/Defaut-1.png'\"></a> </div> </div> <div class=\"right-cont\"> <div class=\"vote\">  <a class=\"tooltip\" id=\"59895d1e774c496619e012bd_0\" onclick=\"like_not_login('59895d1e774c496619e012bd_0')\" original-title=\"BÃ¬nh chá»�n\"><img alt=\"vote\" src=\"https://mingid.mediacdn.vn/v4/images/comment/pixel.gif\"></a>  </div> <a href=\"javascript://\" id=\"vote-count-59895d1e774c496619e012bd\" class=\"vote-count tooltiplist cm-list-voted\" rel=\"ChÆ°a cÃ³ bÃ¬nh chá»�n nÃ o\" original-title=\"\"> 0 </a> </div> <div class=\"cent-cont\"> <div class=\"item-info\"> <a class=\"full-name\" title=\"\" target=\"_blank\" href=\"http://vietid.net/click.php?id=MTYwNzY4NjYx&amp;c=e7d3035c24346b6741c5eb94022b40d8\">Silver Andy</a> Â· <span class=\"time-ago\">13h41, ngÃ y 08-08-2017</span> <span class=\"city\" id=\"city_59895d1e774c496619e012bd_0\">  </span>  </div> <div class=\"cm-content\"> <span id=\"com_content_59895d1e774c496619e012bd\"> DÃ¢y káº¿t ná»‘i giá»¯a jack nghe 3.5 vá»›i USB type C cÃ³ váº» hay. Chá»‰ mua má»—i cÃ¡i dÃ¢y Ä‘Ã³ thÃ´i </span> <input id=\"content_hidden_59895d1e774c496619e012bd\" value=\"DÃ¢y káº¿t ná»‘i giá»¯a jack nghe 3.5 vá»›i USB type C cÃ³ váº» hay. Chá»‰ mua má»—i cÃ¡i dÃ¢y Ä‘Ã³ thÃ´i        \" type=\"hidden\"> </div> </div> <div class=\"action\"> <div id=\"cm_reply_59895d1e774c496619e012bd\" class=\"reply cm-reply\" rel=\"Silver Andy\" style=\"\"> <a href=\"javascript://\" rel=\"59895d1e774c496619e012bd\"><img src=\"https://mingid.mediacdn.vn/v4/images/comment/pixel.gif\" class=\"ico\" alt=\"Tráº£ lá»�i\"> Tráº£ lá»�i</a> <input value=\"0\" type=\"hidden\"> </div>   <div class=\"admin-action\"> <a class=\"tooltip\" original-title=\"BÃ¡o vi pháº¡m\" onclick=\"report_not_login('59895d1e774c496619e012bd')\" id=\"report_59895d1e774c496619e012bd\"> <img src=\"https://mingid.mediacdn.vn/v4/images/comment/pixel.gif\" class=\"ico cm-report\" alt=\"\"> </a> </div>  </div> </div> <div class=\"clear\"></div> <ul class=\"sub-cm hide\" id=\"sub_cm_59895d1e774c496619e012bd\">   </ul> <div class=\"clear\"></div> </li>   </ul> </div>";
	//	String cmttext = "<div class=\"mingid-commentData\"> <ul class=\"cm-list\" id=\"comment_post_0\" alt=\"0\">    <li id=\"itemComment_5997c4c3774c49d675e012be\" name=\"itemComment_5997c4c3774c49d675e012be\"> <div id=\"form_comment_5997c4c3774c49d675e012be\"> <div class=\"left-cont\"> <div class=\"avatar\"> <a target=\"_blank\" href=\"http://vietid.net/click.php?id=MTY3OTk4NzQ1&amp;c=fe7c9f24fe26fa20ec0046107a4edf64\"><img alt=\"0949343282\" src=\"./Defaut-1.png\" onerror=\"this.src='https://mingid.mediacdn.vn/v4/images/comment/Defaut-1.png'\"></a> </div> </div> <div class=\"right-cont\"> <div class=\"vote\">  <a class=\"tooltip\" id=\"5997c4c3774c49d675e012be_8\" onclick=\"like_not_login('5997c4c3774c49d675e012be_8')\" original-title=\"BÃ¬nh chá»�n\"><img alt=\"vote\" src=\"./pixel.gif\"></a>  </div> <a href=\"javascript://\" id=\"vote-count-5997c4c3774c49d675e012be\" onclick=\"popupUserLiked('5997c4c3774c49d675e012be','5997c4c3774c49d675e012be_8',0)\" class=\"vote-count tooltiplist cm-list-voted\" rel=\"Doggie ahihi<br/>\" original-title=\"\"> +1 </a> </div> <div class=\"cent-cont\"> <div class=\"item-info\"> <a class=\"full-name\" title=\"\" target=\"_blank\" href=\"http://vietid.net/click.php?id=MTY3OTk4NzQ1&amp;c=fe7c9f24fe26fa20ec0046107a4edf64\">Bá»‘ giÃ </a> Â· <span class=\"time-ago\">11h55, ngÃ y 19-08-2017</span> <span class=\"city\" id=\"city_5997c4c3774c49d675e012be_8\">  </span>  </div> <div class=\"cm-content\"> <span id=\"com_content_5997c4c3774c49d675e012be\"> Tháº¿ tÃ¨ ra quáº§n lÃ  cÃ³ tháº­t Ã ? máº¥y nay báº­n chÆ°a Ä‘i xem Ä‘Æ°á»£c.. á»ž HÃ  Ná»™i Ä‘Ã£ cÃ³ Ã´ng nÃ o xem tÃ¨ ra quáº§n chÆ°a áº¡ <img alt=\"\" src=\"./24.gif\" align=\"absmiddle\">) </span> <input id=\"content_hidden_5997c4c3774c49d675e012be\" value=\"Tháº¿ tÃ¨ ra quáº§n lÃ  cÃ³ tháº­t Ã ? máº¥y nay báº­n chÆ°a Ä‘i xem Ä‘Æ°á»£c.. á»ž HÃ  Ná»™i Ä‘Ã£ cÃ³ Ã´ng nÃ o xem tÃ¨ ra quáº§n chÆ°a áº¡ =)))        \" type=\"hidden\"> </div> </div> <div class=\"action\"> <div id=\"cm_reply_5997c4c3774c49d675e012be\" class=\"reply cm-reply\" rel=\"Bá»‘ giÃ \" style=\"\"> <a href=\"javascript://\" rel=\"5997c4c3774c49d675e012be\"><img src=\"./pixel.gif\" class=\"ico\" alt=\"Tráº£ lá»�i\"> Tráº£ lá»�i</a> <input value=\"8\" type=\"hidden\"> </div>   <div class=\"edited\" rel=\"Ä�Ã£ sá»­a\"> <a id=\"edit_cm_5997c4c3774c49d675e012be\" href=\"javascript://\" rel=\"5997c4c3774c49d675e012be\" onclick=\"show_list_edit_comment('5997c4c3774c49d675e012be')\">Ä�Ã£ sá»­a </a> </div>  <div class=\"admin-action\"> <a class=\"tooltip\" original-title=\"BÃ¡o vi pháº¡m\" onclick=\"report_not_login('5997c4c3774c49d675e012be')\" id=\"report_5997c4c3774c49d675e012be\"> <img src=\"./pixel.gif\" class=\"ico cm-report\" alt=\"\"> </a> </div>  </div> </div> <div class=\"clear\"></div> <ul class=\"sub-cm hide\" id=\"sub_cm_5997c4c3774c49d675e012be\">   </ul> <div class=\"clear\"></div> </li>   <li id=\"itemComment_59965ec7774c49a471e012bd\" name=\"itemComment_59965ec7774c49a471e012bd\"> <div id=\"form_comment_59965ec7774c49a471e012bd\"> <div class=\"left-cont\"> <div class=\"avatar\"> <a target=\"_blank\" href=\"http://vietid.net/click.php?id=NzkxMzc5MA==&amp;c=aa9d9d646c6db9495a25e1be1a363500\"><img alt=\"duyphuongsld@gmail.com\" src=\"./7913790.jpg\" onerror=\"this.src='https://mingid.mediacdn.vn/v4/images/comment/Defaut-1.png'\"></a> </div> </div> <div class=\"right-cont\"> <div class=\"vote\">  <a class=\"tooltip\" id=\"59965ec7774c49a471e012bd_7\" onclick=\"like_not_login('59965ec7774c49a471e012bd_7')\" original-title=\"BÃ¬nh chá»�n\"><img alt=\"vote\" src=\"./pixel.gif\"></a>  </div> <a href=\"javascript://\" id=\"vote-count-59965ec7774c49a471e012bd\" onclick=\"popupUserLiked('59965ec7774c49a471e012bd','59965ec7774c49a471e012bd_7',0)\" class=\"vote-count tooltiplist cm-list-voted\" rel=\"01287152092<br/>Zee Ng<br/>rainbow<br/>Tiá»ƒu BÃºm<br/>nguyen hong phuc<br/> vÃ  1 ngÆ°á»�i ná»¯a ...\" original-title=\"\"> +6 </a> </div> <div class=\"cent-cont\"> <div class=\"item-info\"> <a class=\"full-name\" title=\"\" target=\"_blank\" href=\"http://vietid.net/click.php?id=NzkxMzc5MA==&amp;c=aa9d9d646c6db9495a25e1be1a363500\">Ãšt PhÆ°Æ¡ng</a> Â· <span class=\"time-ago\">10h28, ngÃ y 18-08-2017</span> <span class=\"city\" id=\"city_59965ec7774c49a471e012bd_7\">  Â· BÃ¬nh PhÆ°á»›c </span>  </div> <div class=\"cm-content\"> <span id=\"com_content_59965ec7774c49a471e012bd\"> thá»� luÃ´n! coi cÆ°á»�i tá»« áº§u Ä‘áº¿n cuá»‘i, coi 2014 cÃ²n tháº¥y sá»£ hÆ¡n, Ä‘áº§y phim cÃ²n kinh khá»§ng hÆ¡n gáº¥p máº¥y láº§n </span> <input id=\"content_hidden_59965ec7774c49a471e012bd\" value=\"thá»� luÃ´n! coi cÆ°á»�i tá»« áº§u Ä‘áº¿n cuá»‘i, coi 2014 cÃ²n tháº¥y sá»£ hÆ¡n, Ä‘áº§y phim cÃ²n kinh khá»§ng hÆ¡n gáº¥p máº¥y láº§n        \" type=\"hidden\"> </div> </div> <div class=\"action\"> <div id=\"cm_reply_59965ec7774c49a471e012bd\" class=\"reply cm-reply\" rel=\"Ãšt PhÆ°Æ¡ng\" style=\"\"> <a href=\"javascript://\" rel=\"59965ec7774c49a471e012bd\"><img src=\"./pixel.gif\" class=\"ico\" alt=\"Tráº£ lá»�i\"> Tráº£ lá»�i</a> <input value=\"7\" type=\"hidden\"> </div>   <div class=\"admin-action\"> <a class=\"tooltip\" original-title=\"BÃ¡o vi pháº¡m\" onclick=\"report_not_login('59965ec7774c49a471e012bd')\" id=\"report_59965ec7774c49a471e012bd\"> <img src=\"./pixel.gif\" class=\"ico cm-report\" alt=\"\"> </a> </div>  </div> </div> <div class=\"clear\"></div> <ul class=\"sub-cm hide\" id=\"sub_cm_59965ec7774c49a471e012bd\">   </ul> <div class=\"clear\"></div> </li>   <li id=\"itemComment_5995ebbe774c49563ce012bd\" name=\"itemComment_5995ebbe774c49563ce012bd\"> <div id=\"form_comment_5995ebbe774c49563ce012bd\"> <div class=\"left-cont\"> <div class=\"avatar\"> <a target=\"_blank\" href=\"http://vietid.net/click.php?id=Mzc5ODQzNQ==&amp;c=a23855f03df8ebaf93c6e8e86019f3dd\"><img alt=\"ngocxum@gmail.com\" src=\"./3798435.jpg\" onerror=\"this.src='https://mingid.mediacdn.vn/v4/images/comment/Defaut-1.png'\"></a> </div> </div> <div class=\"right-cont\"> <div class=\"vote\">  <a class=\"tooltip\" id=\"5995ebbe774c49563ce012bd_6\" onclick=\"like_not_login('5995ebbe774c49563ce012bd_6')\" original-title=\"BÃ¬nh chá»�n\"><img alt=\"vote\" src=\"./pixel.gif\"></a>  </div> <a href=\"javascript://\" id=\"vote-count-5995ebbe774c49563ce012bd\" onclick=\"popupUserLiked('5995ebbe774c49563ce012bd','5995ebbe774c49563ce012bd_6',0)\" class=\"vote-count tooltiplist cm-list-voted\" rel=\"Pham Thanh Tam<br/>Libra is the most beautiful<br/>Doggie ahihi<br/>\" original-title=\"\"> +3 </a> </div> <div class=\"cent-cont\"> <div class=\"item-info\"> <a class=\"full-name\" title=\"\" target=\"_blank\" href=\"http://vietid.net/click.php?id=Mzc5ODQzNQ==&amp;c=a23855f03df8ebaf93c6e8e86019f3dd\">ngocxum</a> Â· <span class=\"time-ago\">02h17, ngÃ y 18-08-2017</span> <span class=\"city\" id=\"city_5995ebbe774c49563ce012bd_6\">  </span>  </div> <div class=\"cm-content\"> <span id=\"com_content_5995ebbe774c49563ce012bd\"> GIáº­t mÃ¬nh lÃ  chÃ­nh thÃ´i cÃ¡c Ã´ng Æ¡i <img alt=\"\" src=\"./24.gif\" align=\"absmiddle\">)) </span> <input id=\"content_hidden_5995ebbe774c49563ce012bd\" value=\"GIáº­t mÃ¬nh lÃ  chÃ­nh thÃ´i cÃ¡c Ã´ng Æ¡i =))))        \" type=\"hidden\"> </div> </div> <div class=\"action\"> <div id=\"cm_reply_5995ebbe774c49563ce012bd\" class=\"reply cm-reply\" rel=\"ngocxum\" style=\"\"> <a href=\"javascript://\" rel=\"5995ebbe774c49563ce012bd\"><img src=\"./pixel.gif\" class=\"ico\" alt=\"Tráº£ lá»�i\"> Tráº£ lá»�i</a> <input value=\"6\" type=\"hidden\"> </div>   <div class=\"admin-action\"> <a class=\"tooltip\" original-title=\"BÃ¡o vi pháº¡m\" onclick=\"report_not_login('5995ebbe774c49563ce012bd')\" id=\"report_5995ebbe774c49563ce012bd\"> <img src=\"./pixel.gif\" class=\"ico cm-report\" alt=\"\"> </a> </div>  </div> </div> <div class=\"clear\"></div> <ul class=\"sub-cm hide\" id=\"sub_cm_5995ebbe774c49563ce012bd\">   </ul> <div class=\"clear\"></div> </li>   <li id=\"itemComment_59955eaf584c497533e012bd\" name=\"itemComment_59955eaf584c497533e012bd\"> <div id=\"form_comment_59955eaf584c497533e012bd\"> <div class=\"left-cont\"> <div class=\"avatar\"> <a target=\"_blank\" href=\"http://vietid.net/click.php?id=MTYzNTczOTM5&amp;c=8d08b82287b8194abb9bec14c8a5845f\"><img alt=\"kieudiem2k2@gmail.com\" src=\"./Defaut-5.png\" onerror=\"this.src='https://mingid.mediacdn.vn/v4/images/comment/Defaut-1.png'\"></a> </div> </div> <div class=\"right-cont\"> <div class=\"vote\">  <a class=\"tooltip\" id=\"59955eaf584c497533e012bd_5\" onclick=\"like_not_login('59955eaf584c497533e012bd_5')\" original-title=\"BÃ¬nh chá»�n\"><img alt=\"vote\" src=\"./pixel.gif\"></a>  </div> <a href=\"javascript://\" id=\"vote-count-59955eaf584c497533e012bd\" onclick=\"popupUserLiked('59955eaf584c497533e012bd','59955eaf584c497533e012bd_5',0)\" class=\"vote-count tooltiplist cm-list-voted\" rel=\"Yuvybaby<br/>Choi Choi<br/>á»�ng hÃºt<br/>Doggie ahihi<br/>Miyuki<br/>\" original-title=\"\"> +5 </a> </div> <div class=\"cent-cont\"> <div class=\"item-info\"> <a class=\"full-name\" title=\"\" target=\"_blank\" href=\"http://vietid.net/click.php?id=MTYzNTczOTM5&amp;c=8d08b82287b8194abb9bec14c8a5845f\">khÃ´ng cÃ³ tÃªn</a> Â· <span class=\"time-ago\">16h15, ngÃ y 17-08-2017</span> <span class=\"city\" id=\"city_59955eaf584c497533e012bd_5\">  </span>  </div> <div class=\"cm-content\"> <span id=\"com_content_59955eaf584c497533e012bd\"> cá»© lÃ m nhÆ° HQ gÃ¬ cÅ©ng lÃ  nháº¥t i, cÃ¡i gÃ¬ cÅ©ng lÃ´i HQ vÃ o </span> <input id=\"content_hidden_59955eaf584c497533e012bd\" value=\"cá»© lÃ m nhÆ° HQ gÃ¬ cÅ©ng lÃ  nháº¥t i, cÃ¡i gÃ¬ cÅ©ng lÃ´i HQ vÃ o        \" type=\"hidden\"> </div> </div> <div class=\"action\"> <div id=\"cm_reply_59955eaf584c497533e012bd\" class=\"reply cm-reply\" rel=\"khÃ´ng cÃ³ tÃªn\" style=\"\"> <a href=\"javascript://\" rel=\"59955eaf584c497533e012bd\"><img src=\"./pixel.gif\" class=\"ico\" alt=\"Tráº£ lá»�i\"> Tráº£ lá»�i</a> <input value=\"5\" type=\"hidden\"> </div>   <div class=\"admin-action\"> <a class=\"tooltip\" original-title=\"BÃ¡o vi pháº¡m\" onclick=\"report_not_login('59955eaf584c497533e012bd')\" id=\"report_59955eaf584c497533e012bd\"> <img src=\"./pixel.gif\" class=\"ico cm-report\" alt=\"\"> </a> </div>  </div> </div> <div class=\"clear\"></div> <ul class=\"sub-cm hide\" id=\"sub_cm_59955eaf584c497533e012bd\">   </ul> <div class=\"clear\"></div> </li>   <li id=\"itemComment_599546b1a14c49e4584e97d3\" name=\"itemComment_599546b1a14c49e4584e97d3\"> <div id=\"form_comment_599546b1a14c49e4584e97d3\"> <div class=\"left-cont\"> <div class=\"avatar\"> <a target=\"_blank\" href=\"http://vietid.net/click.php?id=MTY3OTc4Mjgw&amp;c=52a99390c5f27fc51b146e88083f784f\"><img alt=\"ntgiangtt\" src=\"./Defaut-5(1).png\" onerror=\"this.src='https://mingid.mediacdn.vn/v4/images/comment/Defaut-1.png'\"></a> </div> </div> <div class=\"right-cont\"> <div class=\"vote\">  <a class=\"tooltip\" id=\"599546b1a14c49e4584e97d3_4\" onclick=\"like_not_login('599546b1a14c49e4584e97d3_4')\" original-title=\"BÃ¬nh chá»�n\"><img alt=\"vote\" src=\"./pixel.gif\"></a>  </div> <a href=\"javascript://\" id=\"vote-count-599546b1a14c49e4584e97d3\" onclick=\"popupUserLiked('599546b1a14c49e4584e97d3','599546b1a14c49e4584e97d3_4',0)\" class=\"vote-count tooltiplist cm-list-voted\" rel=\"Libra is the most beautiful<br/>Doggie ahihi<br/>Miyuki<br/>\" original-title=\"\"> +3 </a> </div> <div class=\"cent-cont\"> <div class=\"item-info\"> <a class=\"full-name\" title=\"\" target=\"_blank\" href=\"http://vietid.net/click.php?id=MTY3OTc4Mjgw&amp;c=52a99390c5f27fc51b146e88083f784f\">giang nguyá»…n</a> Â· <span class=\"time-ago\">14h33, ngÃ y 17-08-2017</span> <span class=\"city\" id=\"city_599546b1a14c49e4584e97d3_4\">  </span>  </div> <div class=\"cm-content\"> <span id=\"com_content_599546b1a14c49e4584e97d3\"> LÃºc báº¯t Ä‘áº§u xem mÃ¬nh nghÄ© cÃ³ láº½ Ä‘Ã¡ng sá»£ láº¯m nhÆ°ng xem xong tháº¥y bt Ã , mÃ  toÃ n bá»‹ giáº­t mÃ¬nh bá»Ÿi tiáº¿ng hÃ©t cá»§a máº¥y báº¡n trong ráº¡p, dÃ£ man </span> <input id=\"content_hidden_599546b1a14c49e4584e97d3\" value=\"LÃºc báº¯t Ä‘áº§u xem mÃ¬nh nghÄ© cÃ³ láº½ Ä‘Ã¡ng sá»£ láº¯m nhÆ°ng xem xong tháº¥y bt Ã , mÃ  toÃ n bá»‹ giáº­t mÃ¬nh bá»Ÿi tiáº¿ng hÃ©t cá»§a máº¥y báº¡n trong ráº¡p, dÃ£ man        \" type=\"hidden\"> </div> </div> <div class=\"action\"> <div id=\"cm_reply_599546b1a14c49e4584e97d3\" class=\"reply cm-reply\" rel=\"giang nguyá»…n\" style=\"\"> <a href=\"javascript://\" rel=\"599546b1a14c49e4584e97d3\"><img src=\"./pixel.gif\" class=\"ico\" alt=\"Tráº£ lá»�i\"> Tráº£ lá»�i</a> <input value=\"4\" type=\"hidden\"> </div>   <div class=\"admin-action\"> <a class=\"tooltip\" original-title=\"BÃ¡o vi pháº¡m\" onclick=\"report_not_login('599546b1a14c49e4584e97d3')\" id=\"report_599546b1a14c49e4584e97d3\"> <img src=\"./pixel.gif\" class=\"ico cm-report\" alt=\"\"> </a> </div>  </div> </div> <div class=\"clear\"></div> <ul class=\"sub-cm hide\" id=\"sub_cm_599546b1a14c49e4584e97d3\">   </ul> <div class=\"clear\"></div> </li>   <li id=\"itemComment_599512673b4c49911314f2e0\" name=\"itemComment_599512673b4c49911314f2e0\"> <div id=\"form_comment_599512673b4c49911314f2e0\"> <div class=\"left-cont\"> <div class=\"avatar\"> <a target=\"_blank\" href=\"http://vietid.net/click.php?id=MjA3MjUyMzc=&amp;c=20e9b13d6b34b25052b6aa0cb4731cfc\"><img alt=\"0938755819@ming.vn\" src=\"./Defaut-3.png\" onerror=\"this.src='https://mingid.mediacdn.vn/v4/images/comment/Defaut-1.png'\"></a> </div> </div> <div class=\"right-cont\"> <div class=\"vote\">  <a class=\"tooltip\" id=\"599512673b4c49911314f2e0_3\" onclick=\"like_not_login('599512673b4c49911314f2e0_3')\" original-title=\"BÃ¬nh chá»�n\"><img alt=\"vote\" src=\"./pixel.gif\"></a>  </div> <a href=\"javascript://\" id=\"vote-count-599512673b4c49911314f2e0\" onclick=\"popupUserLiked('599512673b4c49911314f2e0','599512673b4c49911314f2e0_3',0)\" class=\"vote-count tooltiplist cm-list-voted\" rel=\"Zee Ng<br/>rainbow<br/>Choi Choi<br/>Doggie ahihi<br/>Miyuki<br/> vÃ  1 ngÆ°á»�i ná»¯a ...\" original-title=\"\"> +6 </a> </div> <div class=\"cent-cont\"> <div class=\"item-info\"> <a class=\"full-name\" title=\"\" target=\"_blank\" href=\"http://vietid.net/click.php?id=MjA3MjUyMzc=&amp;c=20e9b13d6b34b25052b6aa0cb4731cfc\">GUILUN</a> Â· <span class=\"time-ago\">10h49, ngÃ y 17-08-2017</span> <span class=\"city\" id=\"city_599512673b4c49911314f2e0_3\">  Â· TP HCM </span>  </div> <div class=\"cm-content\"> <span id=\"com_content_599512673b4c49911314f2e0\"> nÃ³i tháº­t phim nÃ y ko sá»£ báº±ng nhá»¯ng phim khÃ¡c mÃ  bÃ¡o chÃ­ cá»© tung hÃ´ lÃªn lÃ m quÃ¡ hoáº·c lÃ  hiá»‡u á»©ng Ä‘Ã¡m Ä‘Ã´ng chÄƒng. </span> <input id=\"content_hidden_599512673b4c49911314f2e0\" value=\"nÃ³i tháº­t phim nÃ y ko sá»£ báº±ng nhá»¯ng phim khÃ¡c mÃ  bÃ¡o chÃ­ cá»© tung hÃ´ lÃªn lÃ m quÃ¡ hoáº·c lÃ  hiá»‡u á»©ng Ä‘Ã¡m Ä‘Ã´ng chÄƒng.        \" type=\"hidden\"> </div> </div> <div class=\"action\"> <div id=\"cm_reply_599512673b4c49911314f2e0\" class=\"reply cm-reply\" rel=\"GUILUN\" style=\"\"> <a href=\"javascript://\" rel=\"599512673b4c49911314f2e0\"><img src=\"./pixel.gif\" class=\"ico\" alt=\"Tráº£ lá»�i\"> Tráº£ lá»�i</a> <input value=\"3\" type=\"hidden\"> </div>   <div class=\"admin-action\"> <a class=\"tooltip\" original-title=\"BÃ¡o vi pháº¡m\" onclick=\"report_not_login('599512673b4c49911314f2e0')\" id=\"report_599512673b4c49911314f2e0\"> <img src=\"./pixel.gif\" class=\"ico cm-report\" alt=\"\"> </a> </div>  </div> </div> <div class=\"clear\"></div> <ul class=\"sub-cm \" id=\"sub_cm_599512673b4c49911314f2e0\">      <li style=\"\" id=\"itemComment_599acde85b4c495f04fc8a6a\" name=\"itemComment_599acde85b4c495f04fc8a6a\"> <div id=\"form_comment_599acde85b4c495f04fc8a6a\"> <div class=\"sub-left-cont\"> <div class=\"avatar\"> <a target=\"_blank\" href=\"http://vietid.net/click.php?id=MzA2NzkwNA==&amp;c=80f35aa281672f86750eb1501bd5a83d\"><img alt=\"caoducqui@gmail.com\" src=\"./Defaut-4.png\" onerror=\"this.src='https://mingid.mediacdn.vn/v4/images/comment/Defaut-1.png'\"></a> </div> </div> <div class=\"sub-right-cont\"> <div class=\"vote\">  <a class=\"tooltip\" id=\"599acde85b4c495f04fc8a6a_3_0\" onclick=\"like_not_login('599acde85b4c495f04fc8a6a_3_0')\" original-title=\"BÃ¬nh chá»�n\"><img alt=\"vote\" src=\"./pixel.gif\"></a>  </div> <a href=\"javascript://\" id=\"vote-count-599acde85b4c495f04fc8a6a\" class=\"vote-count tooltiplist cm-list-voted\" onclick=\"popupUserLiked('599acde85b4c495f04fc8a6a','599acde85b4c495f04fc8a6a_3_0',0)\" rel=\"Libra is the most beautiful<br/>\" original-title=\"\">+1</a> </div> <div class=\"sub-cent-cont\"> <div class=\"item-info\"> <a class=\"full-name\" title=\"\" target=\"_blank\" href=\"http://vietid.net/click.php?id=MzA2NzkwNA==&amp;c=80f35aa281672f86750eb1501bd5a83d\">Deadangel</a> Â· <span class=\"time-ago\">19h11, ngÃ y 21-08-2017</span> <span class=\"city\" id=\"city_599acde85b4c495f04fc8a6a_3_0\">  </span>  </div> <div class=\"cm-content\"> <span id=\"comment_content_599acde85b4c495f04fc8a6a\">@GUILUN: Phim nÃ o sá»£ hÆ¡n phim nÃ y báº¡n? Conjuring 1, 2? Insidious? T coi phim kinh dá»‹ cáº£ chá»¥c nÄƒm nay vÃ  tháº¥y phim nÃ y Ä‘á»™ hÃ¹ lÃ  ghÃª nháº¥t. Báº¡n khÃ´ng tháº¥y ghÃª vÃ¬ báº¡n Ä‘Ã£ xem ráº¡p vá»›i nhiá»�u ngÆ°á»�i, náº¿u tá»± xem 1 mÃ¬nh sáº½ khÃ¡c.</span> <input id=\"content_hidden_599acde85b4c495f04fc8a6a\" value=\"@GUILUN: Phim nÃ o sá»£ hÆ¡n phim nÃ y báº¡n? Conjuring 1, 2? Insidious? T coi phim kinh dá»‹ cáº£ chá»¥c nÄƒm nay vÃ  tháº¥y phim nÃ y Ä‘á»™ hÃ¹ lÃ  ghÃª nháº¥t. Báº¡n khÃ´ng tháº¥y ghÃª vÃ¬ báº¡n Ä‘Ã£ xem ráº¡p vá»›i nhiá»�u ngÆ°á»�i, náº¿u tá»± xem 1 mÃ¬nh sáº½ khÃ¡c.\" type=\"hidden\"> </div> </div> <div class=\"action\"> <div id=\"sub_cm_reply_599acde85b4c495f04fc8a6a\" class=\"reply sub-cm-reply\" rel=\"Deadangel\" style=\"\"> <a href=\"javascript://\" rel=\"599512673b4c49911314f2e0_599acde85b4c495f04fc8a6a\"><img src=\"./pixel.gif\" class=\"ico\" alt=\"Tráº£ lá»�i\"> Tráº£ lá»�i</a> <input value=\"3\" type=\"hidden\"> </div>   <div class=\"admin-action\"> <a class=\"tooltip\" original-title=\"BÃ¡o vi pháº¡m\" onclick=\"report_not_login('599acde85b4c495f04fc8a6a')\" id=\"report_599acde85b4c495f04fc8a6a\"> <img src=\"./pixel.gif\" class=\"ico cm-report\" alt=\"\"> </a> </div>  </div> </div> <div class=\"clear\"></div> </li>  </ul> <div class=\"clear\"></div> </li>   <li id=\"itemComment_59945d47794c494835fc8a65\" name=\"itemComment_59945d47794c494835fc8a65\"> <div id=\"form_comment_59945d47794c494835fc8a65\"> <div class=\"left-cont\"> <div class=\"avatar\"> <a target=\"_blank\" href=\"http://vietid.net/click.php?id=MTYzODM4MDY4&amp;c=4ce377d043d48cc3d816b34479dd4889\"><img alt=\"0969714963@ming.vn\" src=\"./Defaut-6.png\" onerror=\"this.src='https://mingid.mediacdn.vn/v4/images/comment/Defaut-1.png'\"></a> </div> </div> <div class=\"right-cont\"> <div class=\"vote\">  <a class=\"tooltip\" id=\"59945d47794c494835fc8a65_2\" onclick=\"like_not_login('59945d47794c494835fc8a65_2')\" original-title=\"BÃ¬nh chá»�n\"><img alt=\"vote\" src=\"./pixel.gif\"></a>  </div> <a href=\"javascript://\" id=\"vote-count-59945d47794c494835fc8a65\" onclick=\"popupUserLiked('59945d47794c494835fc8a65','59945d47794c494835fc8a65_2',0)\" class=\"vote-count tooltiplist cm-list-voted\" rel=\"rainbow<br/>Doggie ahihi<br/>\" original-title=\"\"> +2 </a> </div> <div class=\"cent-cont\"> <div class=\"item-info\"> <a class=\"full-name\" title=\"\" target=\"_blank\" href=\"http://vietid.net/click.php?id=MTYzODM4MDY4&amp;c=4ce377d043d48cc3d816b34479dd4889\">ThuyNga</a> Â· <span class=\"time-ago\">21h57, ngÃ y 16-08-2017</span> <span class=\"city\" id=\"city_59945d47794c494835fc8a65_2\">  </span>  </div> <div class=\"cm-content\"> <span id=\"com_content_59945d47794c494835fc8a65\"> cháº³ng cÃ³ j sá»£. nhÃ¬n bÃºp bÃª cÃ²n tháº¥y buá»“n cÆ°á»�i </span> <input id=\"content_hidden_59945d47794c494835fc8a65\" value=\"cháº³ng cÃ³ j sá»£. nhÃ¬n bÃºp bÃª cÃ²n tháº¥y buá»“n cÆ°á»�i        \" type=\"hidden\"> </div> </div> <div class=\"action\"> <div id=\"cm_reply_59945d47794c494835fc8a65\" class=\"reply cm-reply\" rel=\"ThuyNga\" style=\"\"> <a href=\"javascript://\" rel=\"59945d47794c494835fc8a65\"><img src=\"./pixel.gif\" class=\"ico\" alt=\"Tráº£ lá»�i\"> Tráº£ lá»�i</a> <input value=\"2\" type=\"hidden\"> </div>   <div class=\"admin-action\"> <a class=\"tooltip\" original-title=\"BÃ¡o vi pháº¡m\" onclick=\"report_not_login('59945d47794c494835fc8a65')\" id=\"report_59945d47794c494835fc8a65\"> <img src=\"./pixel.gif\" class=\"ico cm-report\" alt=\"\"> </a> </div>  </div> </div> <div class=\"clear\"></div> <ul class=\"sub-cm hide\" id=\"sub_cm_59945d47794c494835fc8a65\">   </ul> <div class=\"clear\"></div> </li>   <li id=\"itemComment_5994273ea14c4962664e97d3\" name=\"itemComment_5994273ea14c4962664e97d3\"> <div id=\"form_comment_5994273ea14c4962664e97d3\"> <div class=\"left-cont\"> <div class=\"avatar\"> <a target=\"_blank\" href=\"http://vietid.net/click.php?id=MzY5MjA0NQ==&amp;c=9a1a750bed1e8933647a837ed2135d51\"><img alt=\"precious1081@yahoo.com\" src=\"./Defaut-2(1).png\" onerror=\"this.src='https://mingid.mediacdn.vn/v4/images/comment/Defaut-1.png'\"></a> </div> </div> <div class=\"right-cont\"> <div class=\"vote\">  <a class=\"tooltip\" id=\"5994273ea14c4962664e97d3_1\" onclick=\"like_not_login('5994273ea14c4962664e97d3_1')\" original-title=\"BÃ¬nh chá»�n\"><img alt=\"vote\" src=\"./pixel.gif\"></a>  </div> <a href=\"javascript://\" id=\"vote-count-5994273ea14c4962664e97d3\" onclick=\"popupUserLiked('5994273ea14c4962664e97d3','5994273ea14c4962664e97d3_1',0)\" class=\"vote-count tooltiplist cm-list-voted\" rel=\"rainbow<br/>Yuvybaby<br/>Doggie ahihi<br/>\" original-title=\"\"> +3 </a> </div> <div class=\"cent-cont\"> <div class=\"item-info\"> <a class=\"full-name\" title=\"\" target=\"_blank\" href=\"http://vietid.net/click.php?id=MzY5MjA0NQ==&amp;c=9a1a750bed1e8933647a837ed2135d51\">gÃ  vÄƒn con</a> Â· <span class=\"time-ago\">18h06, ngÃ y 16-08-2017</span> <span class=\"city\" id=\"city_5994273ea14c4962664e97d3_1\">  </span>  </div> <div class=\"cm-content\"> <span id=\"com_content_5994273ea14c4962664e97d3\"> tháº¥y quÃ¡ bt cÃ³ gÃ¬ Ä‘Ã¢u sá»£ trá»�i, cháº¯c do sá»£ theo hiá»‡u á»©ng Ä‘Ã¡m Ä‘Ã´ng </span> <input id=\"content_hidden_5994273ea14c4962664e97d3\" value=\"tháº¥y quÃ¡ bt cÃ³ gÃ¬ Ä‘Ã¢u sá»£ trá»�i, cháº¯c do sá»£ theo hiá»‡u á»©ng Ä‘Ã¡m Ä‘Ã´ng        \" type=\"hidden\"> </div> </div> <div class=\"action\"> <div id=\"cm_reply_5994273ea14c4962664e97d3\" class=\"reply cm-reply\" rel=\"gÃ  vÄƒn con\" style=\"\"> <a href=\"javascript://\" rel=\"5994273ea14c4962664e97d3\"><img src=\"./pixel.gif\" class=\"ico\" alt=\"Tráº£ lá»�i\"> Tráº£ lá»�i</a> <input value=\"1\" type=\"hidden\"> </div>   <div class=\"admin-action\"> <a class=\"tooltip\" original-title=\"BÃ¡o vi pháº¡m\" onclick=\"report_not_login('5994273ea14c4962664e97d3')\" id=\"report_5994273ea14c4962664e97d3\"> <img src=\"./pixel.gif\" class=\"ico cm-report\" alt=\"\"> </a> </div>  </div> </div> <div class=\"clear\"></div> <ul class=\"sub-cm hide\" id=\"sub_cm_5994273ea14c4962664e97d3\">   </ul> <div class=\"clear\"></div> </li>   <li id=\"itemComment_5993d057a14c49063f4e97de\" name=\"itemComment_5993d057a14c49063f4e97de\"> <div id=\"form_comment_5993d057a14c49063f4e97de\"> <div class=\"left-cont\"> <div class=\"avatar\"> <a target=\"_blank\" href=\"http://vietid.net/click.php?id=MTA5NTUxOTk4&amp;c=9fec264710d0e0027a4da06908b236b5\"><img alt=\"0963151132@ming.vn\" src=\"./no-avatar.png\" onerror=\"this.src='https://mingid.mediacdn.vn/v4/images/comment/Defaut-1.png'\"></a> </div> </div> <div class=\"right-cont\"> <div class=\"vote\">  <a class=\"tooltip\" id=\"5993d057a14c49063f4e97de_0\" onclick=\"like_not_login('5993d057a14c49063f4e97de_0')\" original-title=\"BÃ¬nh chá»�n\"><img alt=\"vote\" src=\"./pixel.gif\"></a>  </div> <a href=\"javascript://\" id=\"vote-count-5993d057a14c49063f4e97de\" onclick=\"popupUserLiked('5993d057a14c49063f4e97de','5993d057a14c49063f4e97de_0',0)\" class=\"vote-count tooltiplist cm-list-voted\" rel=\"Yuvybaby<br/>Doggie ahihi<br/>\" original-title=\"\"> +2 </a> </div> <div class=\"cent-cont\"> <div class=\"item-info\"> <a class=\"full-name\" title=\"\" target=\"_blank\" href=\"http://vietid.net/click.php?id=MTA5NTUxOTk4&amp;c=9fec264710d0e0027a4da06908b236b5\">Raebyun</a> Â· <span class=\"time-ago\">11h55, ngÃ y 16-08-2017 qua Ä‘iá»‡n thoáº¡i</span> <span class=\"city\" id=\"city_5993d057a14c49063f4e97de_0\">  Â· TP HCM </span>  </div> <div class=\"cm-content\"> <span id=\"com_content_5993d057a14c49063f4e97de\"> biáº¿t sá»£ cÃ²n Ä‘i coi, Äƒn theo phong trÃ o , há»… tháº¥y ná»•i trÃªn máº¡ng lÃ  Ä‘áº¿n ráº¡p </span> <input id=\"content_hidden_5993d057a14c49063f4e97de\" value=\"biáº¿t sá»£ cÃ²n Ä‘i coi, Äƒn theo phong trÃ o , há»… tháº¥y ná»•i trÃªn máº¡ng lÃ  Ä‘áº¿n ráº¡p        \" type=\"hidden\"> </div> </div> <div class=\"action\"> <div id=\"cm_reply_5993d057a14c49063f4e97de\" class=\"reply cm-reply\" rel=\"Raebyun\" style=\"\"> <a href=\"javascript://\" rel=\"5993d057a14c49063f4e97de\"><img src=\"./pixel.gif\" class=\"ico\" alt=\"Tráº£ lá»�i\"> Tráº£ lá»�i</a> <input value=\"0\" type=\"hidden\"> </div>   <div class=\"admin-action\"> <a class=\"tooltip\" original-title=\"BÃ¡o vi pháº¡m\" onclick=\"report_not_login('5993d057a14c49063f4e97de')\" id=\"report_5993d057a14c49063f4e97de\"> <img src=\"./pixel.gif\" class=\"ico cm-report\" alt=\"\"> </a> </div>  </div> </div> <div class=\"clear\"></div> <ul class=\"sub-cm hide\" id=\"sub_cm_5993d057a14c49063f4e97de\">   </ul> <div class=\"clear\"></div> </li>   </ul> </div>";

		// get html
		URL url;
		String content = "";
		
		String link = "https://comment.vietid.net/comments?app_key=d9c694bd04eb35d96f1d71a84141d075&content_url=http://kenh14.vn/news-2017091023380879.chn&news_title=R2nhuqNuZyB2acOqbiDEkEggVGjGsMahbmcgbeG6oWkgdHJvbmcgdOG6pW0g4bqjbmggY2jhu6VwIGzDqW46IFRyxrDhu51uZyBjw7MgImPhu7FjIHBo4bqpbSIgdGjhur8gbsOgeSwga2jDtG5nIGNoxINtIGjhu41jIGPFqW5nIHBow60h&num_count=5&debugcache=1&min=0&scroll=0&http_referer=http://kenh14.vn/giang-vien-dh-thuong-mai-trong-tam-anh-chup-len-truong-co-cuc-pham-the-nay-khong-cham-hoc-cung-phi-2017091023380879.chn&verify=1&verify_flag=12469e7a440434b9681487045139fee9&funny_flag=0&height=238&iframe_comment_id=mingid_comment_iframe&comment_flag=0&news_url_short=doi-song&real_time=undefined&is_hidden_comment=0";
		try {
			url = new URL(link);
			
			URLConnection connection = url.openConnection();
			
			InputStream inputStream = connection.getInputStream();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
			
			String line = br.readLine();
						
			while(line !=null) {
				content += line;
				line = br.readLine();
			}
			br.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(content);
		
		System.out.println("Pattern 1");
		String pattern = "<span id=\"\\w{1,}\\s{0,}\">\\s(.+?)\\s</span>";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(content);
		String cmString = null;
		while(m.find())
		{
			System.out.println(m.group(0));
			cmString += m.group(0);
		}
		System.out.println(cmString);
		
		System.out.println("Pattern 2");
		pattern = ">\\s(.+?)\\s</";
		p = Pattern.compile(pattern);
		m = p.matcher(cmString);
		String cmString2 = "";
		ArrayList<String> arr_list1 = new ArrayList<>();
		while(m.find())
		{
			cmString2 = m.group(0);
			arr_list1.add(cmString2);
			cmString2 = "";
		}
		System.out.println(arr_list1);
		
		
		// Patern 3
		System.out.println("Pattern 3");
		String pat = "\\s(.+?){1,}\\s";
		p = Pattern.compile(pat);
		String cmString3 = "";
		ArrayList<String> arr_list2 = new ArrayList<>();
		for (String string : arr_list1) {
			m = p.matcher(string);
			while(m.find())
			{
				System.out.println(m.group(0));
				arr_list2.add(m.group(0));
			}
		}
		
		System.out.println("KQ");
		
		for (String string : arr_list2) {
			System.out.println(string);
		}
	}
}
