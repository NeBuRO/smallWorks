<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="layout" tagdir="/WEB-INF/tags" %>
<layout:profile_layout title="New Offer" class2="">
    <jsp:attribute name="container">
<div class="marginSide"> 
    <h2>Search <small> customize your small works search</small></h2>
                <hr>
    <div class="row">
        <div class="col-md-12">
            <form class="form-horizontal" role="form">
                <div class="col-md-6">
                    <div class="form-group">
                        <label class="control-label col-sm-2">Título:</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-2">Descrição:</label>
                        <div class="col-sm-10">
                            <textarea class="form-control" rows="4"></textarea>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="control-label col-sm-2">Recompensa:</label>
                        <div class="col-sm-3">
                            <input type="text" class="form-control">
                        </div>
                        <label class="control-label col-sm-1">€</label>
                        <div class="col-sm-6 pull-right">
                            <div class="checkbox">
                                <label class="control-label"><input  type="checkbox">Negociável</label>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-md-6">
                    <div class=" panel panel-default">
                        <div class="panel-heading">Local da Oferta Proposta</div>
                        <br>
                        <div class="form-group">
                            <label class="control-label col-sm-3">Morada:</label>
                            <div class="col-sm-8">
                                <input type="text" class="form-control">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-3">Cod. Postal:</label>
                            <div class="col-sm-2">
                                <input type="text" class="form-control">
                            </div>
                            <div class="control-label pull-left">-</div>
                            <div class="col-sm-2">
                                <input type="text" class="form-control">
                            </div>
                        </div>
                    </div>
                    <p class="pull-right"><button type="button" class="btn btn-primary">Save</button></p>
                </div>
            </form>
        </div>
    </div>
</div>
        </jsp:attribute>
</layout:profile_layout>