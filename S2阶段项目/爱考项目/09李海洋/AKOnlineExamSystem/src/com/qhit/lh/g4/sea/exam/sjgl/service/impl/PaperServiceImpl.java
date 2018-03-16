package com.qhit.lh.g4.sea.exam.sjgl.service.impl;

import java.util.List;
import java.util.Map;

import com.qhit.lh.g4.sea.exam.common.bean.PageBean;
import com.qhit.lh.g4.sea.exam.sjgl.bean.Paper;
import com.qhit.lh.g4.sea.exam.sjgl.bean.PaperClass;
import com.qhit.lh.g4.sea.exam.sjgl.dao.PaperDao;
import com.qhit.lh.g4.sea.exam.sjgl.dao.impl.PaperDaoImpl;
import com.qhit.lh.g4.sea.exam.sjgl.service.PaperService;

/**
 * @author 李海洋
 *TODO
 *2018年1月9日下午3:04:58
 */
public class PaperServiceImpl implements PaperService {
	private PaperDao paperDao = new PaperDaoImpl();
	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.sea.exam.sjgl.service.PaperService#getPaperList(com.qhit.lh.g4.sea.exam.common.bean.PageBean, java.util.Map, int)
	 */
	@Override
	public PageBean<Paper> getPaperList(PageBean<Paper> pageBean,
			Map<String, Object> parameter, int pageIndex) {
		
		return paperDao.getPaperList(pageBean, parameter, pageIndex);
	}
	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.sea.exam.sjgl.service.PaperService#endExam(com.qhit.lh.g4.sea.exam.sjgl.bean.Paper)
	 */
	@Override
	public void endExam(Paper paper) {
		
		paperDao.endExam(paper);
	}
	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.sea.exam.sjgl.service.PaperService#createPaperRandom(com.qhit.lh.g4.sea.exam.sjgl.bean.Paper)
	 */
	@Override
	public void createPaperRandom(Paper paper) {
		
		paperDao.createPaperRandom(paper);
	}
	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.sea.exam.sjgl.service.PaperService#startExam(java.util.List)
	 */
	@Override
	public void startExam(List<PaperClass> paperClasses,Paper paper) {
		
		paperDao.startExam(paperClasses, paper);
	}
	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.sea.exam.sjgl.service.PaperService#getPaperList(com.qhit.lh.g4.sea.exam.sjgl.bean.Paper)
	 */
	@Override
	public List<Paper> getPaperList(Paper paper) {
		
		return paperDao.getPaperList(paper);
	}

}
