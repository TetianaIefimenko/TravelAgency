package edu.khai.voloshyn.travelagency.command.impl.tour;

import edu.khai.voloshyn.travelagency.command.Command;
import edu.khai.voloshyn.travelagency.command.constants.PageType;
import edu.khai.voloshyn.travelagency.command.util.CommandUtil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * The type Get Tours List Command.
 *
 * @author Voloshyn Oleksii
 * @version 1.0
 */
public class GetToursListCommand implements Command {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        new CommandUtil().initializeTourParameters(request);
        return PageType.TOURS_LIST_PAGE.getAddress();
    }
}
