

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


import java.util.Scanner; 


public class mov {

       public void doother(String url) {
		   Document website=null;
			try {
				website=Jsoup.connect(url).get();
				}catch(IOException i) {
					i.printStackTrace();
				}
			Elements b=website.getElementsByClass("lister-list");
			Elements rows=b.get(0).select("div.lister-item-content");
			for(Element row:rows) {

				final String t=row.select(".lister-item-header a").text();
				final String r=row.select("div.ratings-bar strong").text();
				final String p=row.select("p.text-muted").get(1).text();
				final String d=row.select("p a").text();
				System.out.println("Movie:"+t);
				System.out.println("Rating:"+r);
				System.out.println("Director and Actors:"+d);
				System.out.println("Description:"+p+"\n");
				
				
			}
		}
	  
	  public void doscrapping(String url) {
		   Document website=null;
			try {
				website=Jsoup.connect(url).get();
				}catch(IOException i) {
					i.printStackTrace();
				}
			Elements b=website.getElementsByClass("lister list detail sub-list");
			Elements rows=b.get(0).select("div.lister-item-content");
			
			for(Element row:rows) {

				final String t=row.select(".lister-item-header a").text();
				final String r=row.select(".ipl-rating-star__rating").first().text();
				final String p=row.select("p").get(1).text();
				final String d=row.select("p a").text();
			    System.out.println("Movie:"+t);
				System.out.println("Rating:"+r);
				System.out.println("Director and Actors:"+d);
				System.out.println("Description:"+p+"\n");
				
			}
		}
	  
	public static void main(String args[]) {
		mov t=new mov();
		
			
		System.out.println("enter your emotion: \n");
		System.out.println("1.sad\n2.Contempt\n3.Anger\n4.Love\n5.Fear\n6.Enjoyment\n7.Surprise\n8.Happy");
		Scanner c = new Scanner(System.in);
		int emotion = c.nextInt();
		System.out.println("which language movie do you prefer?");
		System.out.println("1.Telugu\n2.Hindi\n3.English");
		int lang=c.nextInt();
		if(emotion==7&&lang==1)
		{
		String tdrama="https://www.imdb.com/list/ls061321539/?sort=user_rating,desc&st_dt=&mode=detail&page=1";
		System.out.println("*****************************************************************\n we recommend you to watch some of the following telugu drama movies:\n");
	    t.doscrapping(tdrama);
		}
		else if(emotion==1&&lang==1)
		{
		System.out.println("*****************************************************************\n we recommend you to watch some of the following telugu thriller movies:\n");
		String ttriller="https://www.imdb.com/list/ls071451676/?st_dt=&mode=detail&page=1&ref_=ttls_vm_dtl&sort=moviemeter,asc";
		t.doscrapping(ttriller);
		}
		else if(emotion==2&&lang==1)
		{
		System.out.println("*****************************************************************\n we recommend you to watch some of the following telugu family movies:\n");
		String thappy="https://www.imdb.com/search/title/?languages=te&title_type=feature&sort=user_rating,desc";
		t.doother(thappy);
		}
	    else if(emotion==6&&lang==1)
		{
		System.out.println("*****************************************************************\n we recommend you to watch some of the following telugu horror movies:\n");
		String thorror="https://www.imdb.com/search/title/?genres=horror&languages=te&view=advanced";
		t.doother(thorror);
		}
		else if(emotion==4&&lang==1)
		{
		System.out.println("*****************************************************************\n we recommend you to watch some of the following telugu thriller movies:\n");
		String ttriller="https://www.imdb.com/list/ls071451676/?st_dt=&mode=detail&page=1&ref_=ttls_vm_dtl&sort=moviemeter,asc";
		t.doscrapping(ttriller);
		}
		else if(emotion==5&&lang==1)
		{
		System.out.println("*****************************************************************\n we recommend you to watch some of the following telugu romantic movies:\n");
		String tlv="https://www.imdb.com/search/title/?genres=romance&languages=te";
		t.doother(tlv);
		}
		else if(emotion==3&&lang==1)
		{
		System.out.println("*****************************************************************\n we recommend you to watch some of the following telugu family movies:\n");
		String thappy="https://www.imdb.com/search/title/?languages=te&title_type=feature&sort=user_rating,desc";
		t.doother(thappy);
		}
		else if(emotion==8&&lang==1)
		{
		System.out.println("*****************************************************************\n we recommend you to watch some of the following telugu sad movies:\n");
		String tsad="https://www.imdb.com/list/ls066203107/?sort=alpha,asc&st_dt=&mode=detail&page=1";
		t.doscrapping(tsad);
		}
		else if(emotion==2&&lang==2)
		{
		System.out.println("*****************************************************************\n we recommend you to watch some of the following hindi sports movies:\n");
		String hsports="https://www.imdb.com/list/ls040032577/?sort=moviemeter,asc&st_dt=&mode=detail&page=1";
		t.doscrapping(hsports);
		}
		else if(emotion==7&&lang==2)
		{
	    System.out.println("*****************************************************************\n we recommend you to watch some of the following hindi drama movies:\n");
		String hdrama="https://www.imdb.com/list/ls056451874/?sort=moviemeter,asc&st_dt=&mode=detail&page=1";
		t.doscrapping(hdrama);
		}
		else if(emotion==6&&lang==2)
		{
		System.out.println("*****************************************************************\n we recommend you to watch some of the following hindi horror movies:\n");
		String hhorror="https://www.imdb.com/list/ls069872722/?sort=moviemeter,asc&st_dt=&mode=detail&page=1";
		t.doscrapping(hhorror);
		}
		else if(emotion==4&&lang==2)
		{
		System.out.println("*****************************************************************\n we recommend you to watch some of the following hindi thriller movies:\n");
		String htriller="https://www.imdb.com/list/ls031387184/?sort=moviemeter,asc&st_dt=&mode=detail&page=1";
		t.doscrapping(htriller);
		}
		else if(emotion==5&&lang==2)
		{	
		System.out.println("*****************************************************************\n we recommend you to watch some of the following hindi romantic movies:\n");
		String hlove="https://www.imdb.com/list/ls055035939/?sort=moviemeter,asc&st_dt=&mode=detail&page=1";
		t.doscrapping(hlove);
		}
		else if(emotion==3&&lang==2)
		{
		System.out.println("*****************************************************************\n we recommend you to watch some of the following hindi family movies:\n");
		String hhappy="https://www.imdb.com/list/ls058544205/?sort=moviemeter,asc&st_dt=&mode=detail&page=1";
		t.doscrapping(hhappy);
		}
		else if(emotion==1&&lang==2)
		{
		System.out.println("*****************************************************************\n we recommend you to watch some of the following hindi musical movies:\n");
		String hmusical="https://www.imdb.com/list/ls020480934/?sort=moviemeter,asc&st_dt=&mode=detail&page=1";
		t.doscrapping(hmusical);
		}
		else if(emotion==8&&lang==2)
		{
		System.out.println("*****************************************************************\n we recommend you to watch some of the following hindi sad movies:\n");
		String hsad="https://www.imdb.com/list/ls074378982/?sort=moviemeter,asc&st_dt=&mode=detail&page=1";
		t.doscrapping(hsad);
		}
		else if(emotion==7&&lang==3)
		{
		System.out.println("*****************************************************************\n we recommend you to watch some of the following english drama movies:\n");
		String edrama="https://www.imdb.com/list/ls025105618/?sort=moviemeter,asc&st_dt=&mode=detail&page=1";
		t.doscrapping(edrama);
		}
		else if(emotion==4&&lang==3)
		{	
		System.out.println("*****************************************************************\n we recommend you to watch some of the following english thriller movies:\n");
		String etriller="https://www.imdb.com/list/ls069479983/?sort=moviemeter,asc&st_dt=&mode=detail&page=1";
		t.doscrapping(etriller);
		}
		else if(emotion==5&&lang==3)
		{
		System.out.println("*****************************************************************\n we recommend you to watch some of the following english romantic movies:\n"); 
		String elove="https://www.imdb.com/list/ls063141206/?sort=moviemeter,asc&st_dt=&mode=detail&page=1";
		t.doscrapping(elove);
		}
		else if(emotion==1&&lang==3)
		{
		System.out.println("*****************************************************************\n we recommend you to watch some of the following english musical movies:\n");
		String emusical="https://www.imdb.com/list/ls068002544/?sort=moviemeter,asc&st_dt=&mode=detail&page=1";
		t.doscrapping(emusical);
		}
		else if(emotion==2&&lang==3)
		{	
		System.out.println("*****************************************************************\n we recommend you to watch some of the following english sports movies:\n");
		String esports="https://www.imdb.com/list/ls051644202/?sort=moviemeter,asc&st_dt=&mode=detail&page=1";
		t.doscrapping(esports);
		}
		else if(emotion==3&&lang==3)
		{
		System.out.println("*****************************************************************\n we recommend you to watch some of the following english family movies:\n");
		String ehappy="https://www.imdb.com/list/ls066632708/?sort=moviemeter,asc&st_dt=&mode=detail&page=1";
		t.doscrapping(ehappy);
	    }
		else if(emotion==8&&lang==3)
		{
		System.out.println("*****************************************************************\n we recommend you to watch some of the following english sad movies:\n");
		String esad="https://www.imdb.com/list/ls000090373/?sort=moviemeter,asc&st_dt=&mode=detail&page=1";
		t.doscrapping(esad);
	    }
		else if(emotion==6&&lang==3)
		{	
		System.out.println("*****************************************************************\n we recommend you to watch some of the following english horror movies:\n");
		String ehorror="https://www.imdb.com/list/ls062983805/?sort=moviemeter,asc&st_dt=&mode=detail&page=1";
		t.doscrapping(ehorror);
		}
		
		
	}
}
