import '../webapp/css/custom.css'

import React from 'react'
import ReactDOM from 'react-dom'

class Page1Page extends React.Component {
	render() {
		return <div className="main">React Page</div>
	}
}

ReactDOM.render(<Page1Page/>, document.getElementById("root"));