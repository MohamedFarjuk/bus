document.getElementById('searchForm').addEventListener('submit', function (e) {
    e.preventDefault(); // Prevent the form from reloading the page

    const from = document.getElementById('from').value;
    const to = document.getElementById('to').value;
    const date = document.getElementById('date').value;

    alert(`Searching for buses from ${from} to ${to} on ${date}.`);
    // You can implement an actual search logic here
});
