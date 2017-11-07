package com.aiko.pact.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.aiko.common.util.FileUtil;

/**
 * 文件上传组件
 * @author RenBowen
 * @date 2017年10月16日-下午4:01:52
 * @since 1.0.0
 * @aiko-crm
 */
@Controller
public class UpLoadController {
	
	@RequestMapping("/kindeditor/uploadFile")
	public String uploadCompnent(@RequestParam(name="file2") MultipartFile file,HttpServletRequest req) {
		String fileName = file.getOriginalFilename();
		System.out.println(req.getSession().getServletContext().getRealPath("imgupload/"));
		String filePath = req.getSession().getServletContext().getRealPath("imgupload/");
		try {
			FileUtil.uploadFile(file.getBytes(), filePath, fileName);
			System.out.println("上传成功");
			return "success";
		} catch (Exception e) {return "fail";}
		
	}
}
