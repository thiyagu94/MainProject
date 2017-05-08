package com.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.bean.MovieDetails;
import com.dao.MovieDetailsDao;
import com.dao.MovieDetailsDaoImpl;

public class MovieDetailsAction extends Action {
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		MovieDetails movie = (MovieDetails) form;
		MovieDetailsDao moviedao = new MovieDetailsDaoImpl();
		if (movie.getActor().equals("") || movie.getActress().equals("") || movie.getDirector().equals("")
				|| movie.getMovieName().equals("") || movie.getRated().equals("") || movie.getReleaseYear().equals("")
				|| movie.getActor() == null || movie.getActress() == null || movie.getDirector() == null
				|| movie.getMovieName() == null || movie.getRated() == null || movie.getReleaseYear() == null) {
			return mapping.findForward("failure");

		}
		else
		{
			boolean result = moviedao.addmovie(movie);
			if(result==true)
				return mapping.findForward("success");
			else
				return mapping.findForward("failure");
		}

	}

}
