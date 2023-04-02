def export(file_name):
    style = 'style="font-size:30px;"'
    html = '<html>\n  <head></head>\n  <body>\n'
    d = {}
    with open('dictionary.txt', 'r', encoding='utf-8') as file:
        d = {" ".join(i.replace("\n", "").split(" ")) for i in file}
    for j in d:
        html += f'    <p {style}> {j} </p>\n'
    html += '  </body>\n</html>'
    
    with open(file_name+'.html', 'w') as page:
        page.write(html)

    return html
