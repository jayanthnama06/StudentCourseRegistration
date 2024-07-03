<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Google Maps Example</title>
    <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <script type="text/javascript">
        google.charts.load("current", {
            "packages":["map"],
            // Note: you will need to get a mapsApiKey for your project.
            // See: https://developers.google.com/chart/interactive/docs/basic_load_libs#load-settings
            "mapsApiKey": "AIzaSyB077CG-S3m-VXyfSyldhHI7xGK-H8cfCM"
        });
        google.charts.setOnLoadCallback(drawChart);
        function drawChart() {
            var data = google.visualization.arrayToDataTable([
                ['Lat', 'Long', 'Name'],
                //[19.0760, 72.8777, 'Mumbai'],
                //[18.5204, 73.8567, 'Pune'],
                //[19.1176, 72.9060, 'Powai'],
                [16.5062, 80.6480,'Vijayawada'],
                [16.3067, 80.4365, 'Guntur'],
                [16.4419, 80.6226, 'KLU'],
            ]);

            var map = new google.visualization.Map(document.getElementById('map_div'));
            map.draw(data, {
                showTooltip: true,
                showInfoWindow: true
            });
        }
    </script>
</head>
<body>
<%@ include file="navbar.jsp" %>
    <div id="map_div" style="width: 800px; height: 700px"></div>
</body>
</html>