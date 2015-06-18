<%-- 
    Document   : editNameModel
    Created on : 6/jun/2015, 22:46:50
    Author     : Manuel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<div class="modal fade" id="editNameModel" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">×</span><span class="sr-only">Close</span></button>
                <h4 class="modal-title" id="myModalLabel"> Profile Name</h4>
            </div>
            <div class="modal-body">
                <div class="row">
                    <form role="form" class="col-md-9 go-right">

                        <div class="form-group">
                            <input  name="firstname" type="text" class="form-control" placeholder="Your First Name">
                            <label for="name">Your First Name</label>
                        </div>
                        <div class="form-group">
                            <input name="lastname" type="text" class="form-control" placeholder="Your Last Name">
                            <label for="phone">Your Last Name</label>
                        </div>

                    </form>
                </div>
            </div>
            <div class="modal-footer">
                <jsp:include page="confirmations.jsp" />
            </div>
        </div>
    </div>
</div>