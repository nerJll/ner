package com.aiko.pact.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.aiko.common.util.FileUtil;

@Controller
public class TestUpload {

	@RequestMapping("file")
	public String testUp() {
		return "pact/test";
	}

	/**
	 * 文件上传Controller
	 * @param file
	 * @param request
	 */
	@RequestMapping("/kindeditor111/uploadFile")
	public void testUpload(@RequestParam("imgFile") MultipartFile file, HttpServletRequest request) {
		String fileName = file.getOriginalFilename();
		System.out.println(request.getSession().getServletContext().getRealPath("/imgupload"));
		String filePath = request.getSession().getServletContext().getRealPath("/imgupload");
		try {
			FileUtil.uploadFile(file.getBytes(), filePath, fileName);
			System.out.println("上传成功");
		} catch (Exception e) {}
	}
}
