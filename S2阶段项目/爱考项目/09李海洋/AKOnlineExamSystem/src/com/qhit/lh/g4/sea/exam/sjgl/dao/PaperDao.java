package com.qhit.lh.g4.sea.exam.sjgl.dao;

import java.util.List;
import java.util.Map;

import com.qhit.lh.g4.sea.exam.common.bean.PageBean;
import com.qhit.lh.g4.sea.exam.sjgl.bean.Paper;
import com.qhit.lh.g4.sea.exam.sjgl.bean.PaperClass;

/**
 * @author 李海洋
 *TODO
 *2018年1月9日下午3:03:43
 */
public interface PaperDao {
	/**
	 * @param paperClasses
	 * 开始考试
	 */
	public void startExam(List<PaperClass> paperClasses,Paper paper);
	/**
	 * @param parameter
	 * @return
	 * 查询试卷列表
	 */
	public PageBean<Paper> getPaperList(PageBean<Paper> pageBean, Map<String, Object> parameter, int pageIndex);
	/**
	 * @param parameter
	 * @return
	 * 查询未开考试卷列表
	 */
	public List<Paper> getPaperList(Paper paper);
	/**
	 * @param paper
	 * 结束考试
	 */
	public void endExam(Paper paper);
	/**
	 * @param paper
	 * 随机组卷
	 */
	public void createPaperRandom(Paper paper);
}
