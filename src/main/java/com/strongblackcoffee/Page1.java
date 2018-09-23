package com.strongblackcoffee;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

/**
 *
 */
@Path("Page1")
public class Page1 {
    
    @Context
    private UriInfo context;
    
    public Page1() {
    }
    
    @GET
    @Produces("text/html")
    public String getHtml() {
        StringBuilder sb = new StringBuilder();
        sb.append("<html lang=\"en\">");
        sb.append("<body>");
        sb.append("<h1>Page 1</h1>");
        sb.append("<p>"+this.getClass().getName()+":getHtml()");
        sb.append("</body>");
        sb.append("</html>");
        
        return sb.toString();
    }

}
