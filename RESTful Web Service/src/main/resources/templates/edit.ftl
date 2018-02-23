<h1>Edit form</h1>

 <form method="post" action="/persons/update" role="form">

     <label >Name</label>
     <input type="text"  name="name" value="${person.getName()}" />
     <input type="hidden"  name="id" value="${person.getId()}"/>

     <input type="submit" value="update" />
 </form>