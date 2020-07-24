<html>
<head>
    <meta charset="UTF-8">
    <title>${name}</title>
    <link rel="stylesheet" type="text/css" href="./swagger-ui.css">
</head>
<body>

<div id="swagger-ui"></div>

<script src="./swagger-ui-bundle.js"></script>
<script src="./swagger-ui-standalone-preset.js"></script>
<script>
    window.onload = function () {

        const ui = SwaggerUIBundle({
            url: "rest/swagger.json",
            dom_id: '#swagger-ui',
            presets: [
                SwaggerUIBundle.presets.apis,
                SwaggerUIStandalonePreset
            ],
            plugins: [
                SwaggerUIBundle.plugins.DownloadUrl
            ],
            layout: "StandaloneLayout"
        })

        window.ui = ui
    }
</script>
</body>
</html>
