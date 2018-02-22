<#--<h1> Persons </h1>-->

<#--<table>-->
    <#--<thead>-->
    <#--<tr>-->
        <#--<td>Name</td>-->
    <#--</tr>-->
    <#--</thead>-->
    <#--<tbody>-->
    <#--<tr>-->
        <#--&lt;#&ndash;<#list persons as person>&ndash;&gt;-->
            <#--&lt;#&ndash;<td>${person}</td>&ndash;&gt;-->
       <#--&lt;#&ndash;</#list>&ndash;&gt;-->

        <#--<td>Arbia </td>-->
    <#--</tr>-->
    <#--</tbody>-->
<#--</table>-->

<html>
    <head
        <title></title>
    </head>
    <body>
        <h1>Persons</h1>

        <a href="/persons/new">Add new person</a>

        <table>
            <thead>
            <tr>
                <th>Name</th>
                <th>Delete</th>
                <th>Edit</th>
            </tr>
            </thead>
            <tbody>
                    <#list persons as person>
                    <tr>
                        <td>${person.getName()}</td>
                        <td> <a href="/persons/delete/${person.getId()}">delete</a> </td>
                        <td> <a href="/persons/edit/${person.getId()}">edit</a> </td>
                    </tr>
                    </#list>
            </tbody>
        </table>

    </body>
</html>