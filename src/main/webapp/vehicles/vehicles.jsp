<form>
<fieldset class="form-group">
    <input type="text" class="form-control" id="model" placeholder="vehicle model" required></input>
</fieldset>
<fieldset class="form-group">
    <input type="text" class="form-control" id="regNo" placeholder="Vehicle reg No" required></input>
</fieldset>
    <fieldset class="form-group">
        <input type="text" class="form-control" id="capacity" placeholder="Vehicle Capacity" required></input>

        <input type="text" class="form-control" id="acquisitionDate" placeholder="Date of acquisition" required></input>
    </fieldset>

    <fieldset class="form-group">
    <input type="text" class="form-control" id="owner" placeholder="vehicle owner" required></input>
</fieldset>
<button class="btn btn-large btn-success" id="submit"  onclick="vehicle.save()">  Submit</button>

</form>