package com.aditya;

import java.util.HashMap;
import java.util.Map;

public class Test {
	
	
	static Map<String,String> map = new HashMap<String,String>();
	
	static{
		
		map.put("","Multi Language,hd ma,dts hdma,dtshd ma,dtshd-ma,esubs,esub,msub,msubs,avc,2CH,2 CH,hindi,proper,repack,(,[,),],},exclusive,-,multisubs,MSUBS,MSUB,ESUBS,ESUB,ac3,aac,snaink,2.1,5.1,6.1,7.1,lovepreet1,lottery,dts,dd5.1,dd5 1,dd2.1,dd2 1,hdmaniacs,ddr,aac,avc,M2Tv,x264,x265,CA DUS,untouched,drc,Team IcTv,hdma,dtsx,epic,eros,youtube,ift,8th anniversary,ictv,xdm,hcsubs,limited,geckos,sh0w,rovers,wiki,legi0n,hevc,hq,rxd,flac,ivandro,dus,esir,repack,FraMeSToR,h264,_eng,eng,h265,NoHate,dxva,viethd,hda,hdw,dtses,hdh,prodji,hds,xmr,team exdr,12mbps,usury,tmg,subs,wetv,dhd,tseries,sfcd,vcdsp,Nadeemshravan,dtshdma");
		map.put("WebHD","webhd,webdl,web dl,web hd,webhdrip,web-dl,webrip,web-hd,WEBHD");
		map.put("BluRay","blu-ray,bluray,bdrip,bluray rip,blu ray,blu ray rip,brrip");
		map.put("HDRip","hdrip,hd-rip,hd rip,hdtv rip,hdtv,dth rip,hdtv,hd tv");
		map.put("DVDRip","dvdrip,dvd rip,dvd-rip");
		map.put("HD DVD","hddvd,hd dvd,hd-dvd");
		map.put("NFRIP","nfrip,nf-rip,nf rip");
		map.put("Extended","extended");
		map.put("Unrated","unrated");
		map.put("10 bit","10 bits");
		map.put("Remux","remux");
		map.put("1080p","1080p");
		map.put("720p","720p");
		
	}

	public static void main(String[] args) {
		System.out.println(RenaingUtil.convertOldFileTONew(map, "this is a hd ma CH bits Language dts hdma file.txt", false));

	}

}
